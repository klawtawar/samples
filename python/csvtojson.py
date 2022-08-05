print("Convert csv files content to json !!!")
splitter = ","

#count number of columns required.
f = open("items.csv", "r")
lines = f.readlines()
keyrow = lines[0]
keys = keyrow.split(splitter)

for j in range(1, len(lines)):
    for i in range(0, len(keys)):
        if j == 1 and i == 0 :
            print("[")

        if i == 0 :
            print("     {")
        key = keys[i].strip()
        rows = lines[j]
        values = rows.split(splitter)
        value = values[i].strip()
        print("         " + '"' + key + '"' + " : " + '"' + value + '"'  )

        if i == len(keys) -1 and j == len(lines) -1 :
            print("    }")
            print("]")
        elif i == len(keys) -1:
            print("     },")


