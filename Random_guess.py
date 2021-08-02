import random

n = random.randint(0,20)

Op = int(input("Sua resposta? "))
if Op == n:
    print("Parabens Acertaste á primeira!")
else:
    if n % 2 == 0:
        print("O numero é par")
        Op = int(input("Sua resposta? "))
        if Op == n:
            print("Acertaste á segunda")
        else:
            if Op > n:
                print("O numero é menor que a tua resposta.")
                Op = int(input("Ultima Resposta?"))
                if Op == n:
                    print("Nice")
                else:
                    print("Falhaste")
                    print("O numero era ", n)
            elif Op < n:
                print("O numero é maior que a tua resposta")
                Op = int(input("Ultima Resposta? "))
                if Op5 == n:
                    print("Nice")
                else:
                    print("Falhaste")
                    print("O numero era ", n)
    else:
        print("O numero é impar")
        Op = int(input("Sua resposta? "))
        if Op == n:
            print("Acertaste á segunda")
        else:
            if Op > n:
                print("O numero é menor que a tua resposta.")
                Op = int(input("Ultima Resposta? "))
                if Op == n:
                    print("Nice")
                else:
                    print("Falhaste")
                    print("O numero era ", n)
            elif Op < n:
                print("O numero é maior que a tua resposta")
                Op = int(input("Ultima Resposta?"))
                if Op == n:
                    print("Nice")
                else:
                    print("Falhaste")
                    print("O numero era ", n)