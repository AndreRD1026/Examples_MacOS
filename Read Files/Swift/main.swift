import CoreData
import PackageDescription
import sourcePath

var opt = 0
var runLopp = false
public var alltext = ""
repeat{
    print("--------Menu--------")
        print("1. Read Local File")
        print("2. Read File with Path")
        print("3. See Content")
        print("4. Exit")
        print("Select one option: ") 
        let opt = readLine()
        switch opt {
        case "1":
            readf()
        case "2":
            print("\nEnter to option 2\n")
        case "3":
            if alltext == ""{
                print("Need read a file before")
            }else{
                print(alltext)
            }
            
        case "4":
            print("\nFinish Program\n") 
            runLopp = true
        default:
            print("\nNeed to choice one option of the menu\n")
        }            
}while(runLopp==false)


//Now is pending the read files in this language

//==========================Using functions==========================

//Function that get the content of local file
func readf(){
    //print("Hola?")
    //alltext = "sale?"
    //let location = "text.txt".stringByExpandingTildeInPath
    //let fileContent = NSString(contentsOfFile: location, encoding: NSUTF8StringEncoding, error: nil)
    //alltext = fileContent
    //print(alltext)

    /*
    do {
        if let path = NSBundle.mainBundle().pathForResource("text", ofType: "txt"){
            let data = try String(contentsOfFile:path, encoding: NSUTF8StringEncoding)

            let myStrings = data.componentsSeparatedByCharactersInSet(NSCharacterSet.newlineCharacterSet())
            print(myStrings)
        }
    } catch let err as NSError {
        //do sth with Error
        print(err)
    }
    */
    let file: FileHandle? = FileHandle(forReadingAtPath: sourcePath.appendingPathComponent("text.txt").path)

if file != nil {

    let data = file?.readDataToEndOfFile()

    file?.closeFile()

    let str = NSString(data: data!, encoding: String.Encoding.utf8.rawValue)
    
    print(str!)
    
} else {
    
    print("Ooops! Have an errror!")
    
}
}