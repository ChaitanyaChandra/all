a = int(input("which table do you need ? :"))
b = int(input("table upto ? :"))
c = b + 1
if a:
    for i in range (1 , c , 1):
        print(f"S.no.{i}  {a}*{i} = {a * i} ")

# which table do you need ? :9
# 9
# table upto ? :10
# 10
# S.no.1  9*1 = 9
# S.no.2  9*2 = 18
# S.no.3  9*3 = 27
# S.no.4  9*4 = 36
# S.no.5  9*5 = 45
# S.no.6  9*6 = 54
# S.no.7  9*7 = 63
# S.no.8  9*8 = 72
# S.no.9  9*9 = 81
# S.no.10  9*10 = 90



