package com.bridgelab.array;

import java.sql.Array;

public class Main {

    public static void main(String[] args)
    {

int arr[] = {10,20,30,20,80,30,40,50,20,40,80};

//Elements of array are :-
for (int i : arr)
{
    System.out.println(" Element of array are " + i);
}
        System.out.println(" ");


// Frequency of elements are

        boolean [] visited=new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
visited[j] = true;
                    count++;
                }
            }
            System.out.println("Frequency of array is " + arr[i] + " " + count);
        }

        System.out.println(" ");

// Largest element of array is
int largest = arr[0];
for(int i=0; i<arr.length; i++){
    if(arr[i] > largest){
        largest = arr[i];
    }
}
System.out.println("Largest element of array is " + largest);
        System.out.println(" ");
// Smallest element of array is
        int smallest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest element of array is " + smallest);
        System.out.println(" ");

        // Print Elements at even position
        for(int i=1; i<arr.length; i=i+2){
            System.out.println(" Elements of Even positions are " + arr[i]);
        }
        System.out.println(" ");

        // Print Elements in reverse order
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(" Elements of Reverse order  are " + arr[i]);
        }
        System.out.println(" ");

        // Print Elements at odd position
        for(int i=0; i<arr.length; i=i+2){
            System.out.println(" Elements of odd positions are " + arr[i]);
        }
        System.out.println(" ");

        //print Duplicate array
        boolean visit[] = new boolean[arr.length];
        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {
            if (visit[i] == true)
                continue;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                {
                    visit[j]=true;
                    System.out.println(arr[j]);
                }


            }
        }
        System.out.println(" ");

    // Print Elements in assending order
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        // Second Largest element of array
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i-1]<arr[i])
            {
            System.out.println("Second largest element is " + arr[i-1]);
            break;
            }
        }

    }
}
