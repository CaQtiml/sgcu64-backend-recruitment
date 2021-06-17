
chkinData = {
    "1" : 0 ,
    "2" : 0 ,
    "3" : 0 ,
    "4" : 0 ,
    "5" : 0
}
popDatabase = {} #(tel,place) (string,string)
placeInf = {
    "1" : "Mahamakut Building" ,
    "2" : "Sara Phra Kaew",
    "3" : "CU Sport Complex",
    "4" : "Sanum Juub",
    "5" : "Samyan Mitr Town"
}
x = True

while x :
    print("Available Command")
    print("1: Check in by using telephone number.")
    print("2: Check out by using telephone number.")
    print("3: Print the number of people in each area.")
    print("4: Exit the Program")
    print("")
    cmd = input("Enter Command: ")
    cmd = str(cmd)
    if cmd == "1" :
        tel = input("Input you telephone number: ")
        tel = str(tel)
        for p1,p2 in placeInf.items():
            print(f"{p1}: {p2}")
        chkin = input("Input place number: ")
        chkin = str(chkin)
        if tel in popDatabase.keys():
            if popDatabase[tel] != chkin:
                chkinData[popDatabase[tel]] -= 1
                popDatabase.pop(tel)
                chkinData[chkin] += 1
                popDatabase[tel] = chkin
        elif tel not in popDatabase.keys():
            chkinData[chkin] += 1
            popDatabase[tel] = chkin
    elif cmd == "2":
        try:
            tel = input("Input you telephone number: ")
            placeNow = popDatabase[tel]
            chkinData[placeNow] -= 1
            popDatabase.pop(tel)
        except:
            print("------------------------------------------")
            continue
    elif cmd == "3":
        for p1,p2 in chkinData.items():
            print(f"{placeInf[p1]}: {p2}")
    elif cmd == "4":
        x = False
    print("------------------------------------------")



