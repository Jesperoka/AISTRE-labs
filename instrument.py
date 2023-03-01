from os import path, system
from sys import argv
from getopt import getopt

NUM_PROBLEMS = 19

def main(argv):
    options, arguments = getopt(argv[1:], "p:t:", ["problem=", "type="])
    commandParts = ["java -Xmx6000m -cp target/aistr.jar nl.tudelft.instrumentation.Main",
                    "--type=",                  # + "fuzzing" or "symbol" or "patching" 
                    "--file=problems/Problem",   # + "1/Problem1.java"
                    "> instrumented/Problem"]   # + "1.java"
    
    instrumentAll = True
    for option, argument in options:
        if option in ("-p", "--problem"):
            if str(argument) in [str(x) for x in range(1, NUM_PROBLEMS + 1)]:
                instrumentAll = False
                problemNumber = int(argument)
            elif str(argument).lower() == "all":
                pass
            else:
                raise RuntimeError("Unknown or too large argument " + argument)
        elif option in ("-t", "--type"):
           commandParts[1] += argument # could check if "fuzzing" or "symbol" or "patching" but w.e.

    def adjustCommandAndExecute(commandParts, i):
        commandParts[2] += str(i) + "/Problem" + str(i) + ".java"
        commandParts[3] += str(i) + ".java"
        print("\nExecuting: " + " ".join(commandParts))
        system(" ".join(commandParts))
        commandParts[2] = commandParts[2].replace(str(i) + "/Problem" + str(i) + ".java", "") 
        commandParts[3] = commandParts[3].replace(str(i) + ".java", "") 

    # Only instrument one file guard clause
    if not instrumentAll:
        adjustCommandAndExecute(commandParts, problemNumber)
        return 0

    # Instrument all files by default
    for i in range(1, NUM_PROBLEMS + 1):
        adjustCommandAndExecute(commandParts, i)

    return 0

if __name__ == "__main__":
    main(argv)