n = int(input())
an = sorted(list(map(int, input().split(" "))))
m = int(input())
am = list(map(int, input().split(" ")))


def bs(goal, array, st, end):
    while st <= end:
        mid = (st+end)//2
        if goal == array[mid]:
            return 1
        elif goal > array[mid]:
            st = mid+1
        elif goal < array[mid]:
            end = mid-1
    return 0


for i in range(m):
    print(bs(am[i], an, 0, n-1))
