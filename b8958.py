n=int(input())
for j in range(n):
    a=input()
    sum=0
    pre=0
    for i in range(len(a)):
        if a[i]=='O':
            pre+=1
            sum+=pre
        elif a[i]=='X':
            pre=0
    print(sum)
