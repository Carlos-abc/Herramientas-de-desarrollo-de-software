#Hangman game

import random

#List of words
words = ["python", "java", "kotlin", "javascript"]

#Random word
word = random.choice(words)

#List of letters
letters = list(word)

#List of hidden letters
hidden = list("-" * len(word))

#List of used letters
used = []

#Number of tries
tries = 8

#Game loop
while tries > 0:
    print()
    print("".join(hidden))
    letter = input("Input a letter: ")

    #Check if the letter is in the word
    if letter in letters:
        #Check if the letter is already used
        if letter in used:
            print("You already typed this letter")
        else:
            #Replace the hidden letter with the correct letter
            for i in range(len(letters)):
                if letters[i] == letter:
                    hidden[i] = letter
            used.append(letter)
    else:
        #Check if the letter is already used
        if letter in used:
            print("You already typed this letter")
        else:
            print("No such letter in the word")
            tries -= 1
            used.append(letter)

    #Check if the word is guessed
    if "-" not in hidden:
        print("You guessed the word!")
        print("You survived!")
        break

#Check if the word is not guessed
if "-" in hidden:
    print("You are hanged!")

#The End

