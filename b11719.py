sum=0; min=101;
for i in range(7):
    a=int(input())
    if a%2==1:
        sum+=a
        if(a<min):
            min=a
if sum==0:
    print(-1)
else:
    print(sum);print(min)