var opt = 0
var runLopp = false
repeat{
    print("--------Menu--------")
        print("1. First opc")
        print("2. Second opc")
        print("3. Third opc")
        print("4. Exit")
        print("Select one option: ") 
        let opt = readLine() // get input number
        switch opt {
        case "1":
            print("\nEnter to option 1\n")
        case "2":
            print("\nEnter to option 2\n")
        case "3":
            print("\nEnter to option 3\n")
        case "4":
            print("\nFinish Program\n") // Finish the loop when you put number 4
            runLopp = true
        default:
            print("\nNeed to choice one option of the menu\n") // When you put another number differents 1 to 4
        }            
}while(runLopp==false)