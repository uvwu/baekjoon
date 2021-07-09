n=int(input())
for i in range(n):
    a=list(list(input().split()))
    for j in range(0,len(a),1):
        for k in range(1, len(a[j])+1,1):
            print(a[j][-k],end="")
        if j==len(a)-1:print()
        else:print(" ",end="")