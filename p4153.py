while True:
    a,b,c=map(int,input().split())
    if a==0 and b==0 and c==0:
        break
    else:
        max=a;
        if b>max:
            max=b;
        if c>max:
            max=c;
        if a==max:
            a=0
        if b==max:
            b=0
        if c==max:
            c=0
    if max**2==a**2+b**2+c**2:
        print("right")
    else: print("wrong")