import re

def palindrome_check(cad):
    texto = re.sub(r'[^a-z0-9]', '', cad.lower())

    if texto == texto[::-1]:
        return f"La frase/palabra '{cad}' es un palíndromo"
    else:
        return f"La frase/palabra '{cad}' no es un palíndromo"
    
if __name__ == "__main__":
    cad = input("Introduzca una frase/palabra: ")
    print(palindrome_check(cad))