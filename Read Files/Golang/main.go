package main

import (
	"fmt"
	"io/ioutil"
	"log"
	"os"
)

var alltext string

func readf() {
	// Read the array bytes
	datosComoBytes, err := ioutil.ReadFile("text.txt")
	if err != nil {
		log.Fatal(err)
	}
	// Cast the array to string
	datosComoString := string(datosComoBytes)
	fmt.Println("Successful upload")
	alltext = datosComoString
}

func readfilepath() {
	file, err := ioutil.ReadFile("/Users/andreramirez/Desktop/Otros/Ejemplos en distintos lenguajes/Read Files/Java/text.txt")

	if err != nil {
		log.Fatal(err)
	}
	text := string(file)
	alltext = text
}

func main() {

	for { // repeat the menu
		fmt.Println("--------Menu--------")
		fmt.Println("1. Read Local File")
		fmt.Println("2. Read File with Path")
		fmt.Println("3. See Content")
		fmt.Println("4. Exit")
		fmt.Printf("Select one option: ")
		var input int
		opt, err := fmt.Scanln(&input)
		if opt < 1 || err != nil {
			fmt.Println("Invalid nummber")
			return
		}
		switch input {
		case 1:
			readf()
			break
		case 2:
			readfilepath()
			break
		case 3:
			if alltext == "" {
				fmt.Println("Need read a file before")
			} else {
				fmt.Println(alltext)
			}

			break
		case 4:
			fmt.Println("\nFinish Program")
			fmt.Println("")
			os.Exit(0)
			break
		default:
			fmt.Println("\nNeed to choice one option of the menu")
			fmt.Println("")
			break
		}
	}
}
