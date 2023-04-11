def dictionaryaddition(a,b):
	dictionary[a] = b
	print(dictionary)

def dictionaryremoval(a):
	dictionary.pop(a)
	print(dictionary)

def inputrequest(request):
	if request == "i":
		print("enter the word: ")
		word = input()
		print("enter the definition: ")
		definition = input()
		dictionaryaddition(word,definition)
	elif request == "d":
		print(dictionary)
		print("what do you want to delete?")
		definitiontodelete = input()
		if definitiontodelete in dictionary:
			dictionaryremoval(definitiontodelete)
		
	elif request == "r":
		print("are you sure?")
		dat = input("y/n? ")
		while dat != "y" and dat != "n":
			dat = input("enter y for yes and n for no. ")
		if dat == "y":
			dictionary.clear()	
	elif request == "e":
		print("here is your completed dictionary:")
		print(dictionary)
	else:
		return "enter a valid input"
	return "sucess"
	

print("this dictionary is empty!")
print("enter some definitions to help fill it out.")

dictionary = {}
usrinput = ""
while usrinput != "e":
	usrinput = input("i = input, d = delete, r = reset, e = end")
	print(inputrequest(usrinput))

