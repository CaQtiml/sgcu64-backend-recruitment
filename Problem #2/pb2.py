
chkinData = {
    "1" : 0 ,
    "2" : 0 ,
    "3" : 0
}
popDatabase = {} #(tel,place) (string,string)
placeInf = {
    "1" : "Mahamakut Building" ,
    "2" : "Sara Phra Kaew",
    "3" : "CU Sport Complex"
}
x = True

while x :
    cmd = input("Enter Command: ")
    cmd = str(cmd)
    if cmd == "1" :
        tel = input("Input you tel num: ")
        tel = str(tel)
        for p1,p2 in placeInf.items():
            print(f"{p1}: {p2}")
        chkin = input("Input Place Num: ")
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
        tel = input("Input you tel num: ")
        placeNow = popDatabase[tel]
        chkinData[placeNow] -= 1
        popDatabase.pop(tel)
    elif cmd == "3":
        for p1,p2 in chkinData.items():
            print(f"{placeInf[p1]}: {p2}")
    elif cmd == "4":
        x = False
    print("------------------------------------------")



