from os import path, exec
from sys import argv
from getopt import getopt

NUM_PROBLEMS = 19

def main(argv):
    options, _ = getopt(argv, "pt:", ["problem=", "type="])
    commandParts = ["java -Xmx2500m -cp target/aistr.jar nl.tudelft.instrumentation.Main",
                    "--type=",                  # + "fuzzing" or "symbol" or "patching" 
                    "--file=problem/Problem",   # + "1/Problem1.java"
                    "> instrumented/Problem"]   # + "1.java"
    
    instrumentAll = True
    for option, argument in options:
        if option in ("-p", "--problem"):
            instrumentAll = False   
            problemNumber = int(argument)
        elif option in ("-t", "--type"):
           commandParts[1] += argument # could check if "fuzzing" or "symbol" or "patching" but w.e.

    def adjustCommandAndExecute(commandParts, i):
        commandParts[2] = "".join(commandParts[2].split("m")[:-1].append("m"))
        commandParts[2] += i
        commandParts[3] = "".join(commandParts[2].split("m")[:-1].append("m"))
        commandParts[3] += i
        exec(" ".join(commandParts))

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