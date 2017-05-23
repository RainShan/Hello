package Hello;

import java.util.Scanner;

public class xunhuan{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner in = new Scanner(System.in);  
	        int size = in.nextInt();  
	        int[][] board = new int[size][size];
	        boolean gotResult = false;
	        int numOfX = 0;
	        int numOfO = 0;
	        
	        for (int i=0;i<size;i++)
	        {
	        	for(int j=0;j<size;j++)
	        	{
	        		board[i][j]=in.nextInt();
	        	}
	        }
	        
	        for(int i =0;i<size;i++)
	        {
	        	numOfX =0;
	        	numOfO =0;
	        	for (int j=0;i<size;i++)
	        	{
	        		if(board[i][j]==1)
	        		{
	        			numOfX++;
	        		}
	        		else
	        		{
	        			numOfO++;
	        		}
	        	}
	        	if (numOfX ==size ||numOfO ==size)
	        	{
	        		gotResult = true;
	        		break;
	        	}
	        }
	        if(!gotResult)
	        {
	        	for(int i =0;i<size;i++)
	        	{
	        		numOfX =0;
	        		numOfO =0;
	        		for (int j=0;i<size;i++)
	        		{
	        			if(board[j][i] ==1)
	        			{
	        				numOfX++;
	        			}
	        			else
	        			{
	        				numOfO++;
	        			}
	        		}
	        		if (numOfX == size ||numOfO ==size)
	        		{
	        			gotResult = true;
		        		break;
	        		}
	        		else
	        		{
	        			numOfX=0;
	        			numOfO=0;
	        		}
	        	}
	        }
	        if(!gotResult)
	        {
	        	for(int i =0;i<size;i++)
	        	{
	        		if(board[i][i]==1)
	        		{
	        			numOfX++;
	        		}
	        		else
	        		{
	        			numOfO++;
	        		}
	        	}
	        	if (numOfX ==size||numOfO ==size)
	        	{
	        		gotResult = true;
	        	}
	        	else
        		{
        			numOfX=0;
        			numOfO=0;
        		}
	        }
	        if(!gotResult)
	        {
	        	for(int i =0;i<size;i++)
	        	{
	        		if(board[i][size-i-1]==1)
	        		{
	        			numOfX++;
	        		}
	        		else
	        		{
	        			numOfO++;
	        		}
	        	}
	        	if (numOfX ==size||numOfO ==size)
	        	{
	        		gotResult = true;
	        	}
	        	else
        		{
        			numOfX=0;
        			numOfO=0;
        		}
	        }
	        if(gotResult)
	        {
	            if(numOfX==size)
	            {
	                System.out.println("X");
	            }
	            else if(numOfO==size)
	            {
	                System.out.println("0");
	            }
	        }
	        else
	        {
	            System.out.println("NIL");
	        }
	    }
	}