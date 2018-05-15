#include <stdio.h>    


int a()
{    
	int score[10]={67,98,75,63,82,79,81,91,66,84};
	int i ;
	for(i = 0 ; i < 9 ; i++)
	{
		score[i + 1] += score[i] ;         
	}
	printf("本次考试总分为:%d\n\n本次考试平均分为：%d\n\n", score[9] , score[9] / 10 ) ;
	return 0 ;

}


int b()
{	
	int score[10]={67,98,75,63,82,79,81,91,66,84};
	int j , max ;
	max = score[0] ;
	for(j = 1 ; j < 10 ; j++ )
	{
		if(score[j] > max)
		{	
			max = score[j] ;
		}
	}
	printf("本次考试最高分为:%d\n\n" , max ) ;
	return 0 ;

}


int c()
{	
	int score[10]={67,98,75,63,82,79,81,91,66,84};
	int k , min ;
	min = score[0] ;
	for(k = 0 ; k < 10 ; k++ )
	{
		if(score[k] < min )
		{
			min = score[k] ;
		}
	}
	printf("本次考试最低分为%d\n\n" , min) ;
	return 0 ;

}


int d()
{	
	int score[10]={67,98,75,63,82,79,81,91,66,84};
	int x , y , z ;
	for(x = 0 ; x < 9 ; x++)
	{
		for(y = 0 ; y < 9 - x ; y++ )
			if(score[y] > score[y + 1])
			{
				z = score[y] ;
				score[y] = score[y + 1] ;
				score[y + 1] = z ;
			}
	}
	printf("考试成绩降序如下:\n") ;
	for(y = 0 ; y <10 ; y++ )
	{
		printf("%d " , score[y] ) ; 
	}
	printf("\n\n") ;
	return 0 ;

}


int main()
{
	a() ;
	b() ;
	c() ;
	d() ;
}