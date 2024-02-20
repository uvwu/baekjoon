#include<stdio.h>
int main()
{
    char board[50][50];
    int n,m,min=64;

    scanf("%d %d",&n,&m);

    for(int i=0;i<n;i++){
            scanf("%s",&board[i]);
    }

    for(int i=0; i<n-7; i++){
        for(int j=0; j<m-7; j++){//초기 좌표가 될수 있는 경우들
            
            int tw=0,tb=0;

            //초기좌표가 W

            for(int a=i; a<i+8; a++){
                for(int b=j; b<j+8; b++){
                    if((a+b)%2==0){
                        if(board[a][b]=='W')
                            tb++;
                        else 
                            tw++;
                    }
                    else{
                        if(board[a][b]=='W')
                            tw++;
                        else
                            tb++;
                    }
                }
            }
            min=min<tb?min:tb;
            min=min<tw?min:tw;
        }
    }
    printf("%d",min);

    return 0;
}