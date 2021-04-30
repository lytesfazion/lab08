import java.lang.reflect.Array;
import java.util.Arrays;

public class judge {
    //add function to add people into the town - call t
//    public int add(int person){
//
//        return 0;
//    }
    public int findJudge (int N, int [][] trust){
        int count = 0;
        int judge = 0;
        //changes the element(or towns person)being referred to
        int x = 0;
        int y = 0;

        int townsPersonCounter = 1;

        boolean inPosAindicator= true;
        //i is the "towns person" being checked out- kinda a process of elimination

        //goal is to iterate thru all towns people checking if they are the judge
        for (int i = 1; i <= N; i++){
            count = 0;
            inPosAindicator= true;


//            int varA = trust[x][0];//rep the stuff in the first col
//            int varB = trust[y][1];//rep the stuff in the second col

            //if towns person is = to the element in the 'A' pos, then it can't be the judge
            if(townsPersonCounter == trust[x][0]){
                inPosAindicator = false;
            }

            //if towns person is = the element in the 'B' pos, then there's a possiblity that it is the judge so I increment count to
            //help identify it later
            if (townsPersonCounter  == trust[y][1] ){
                count++;
            }

            //incrementing all variable
            townsPersonCounter++;
            x++;
            y++;

            //Automatically true but if set to false them there is no need to go thru this
            //if true- I want to increment count for as many times as the towns person is = to the 'B' pos.
            //this will help indicate the judge later
            if (inPosAindicator){
                if(townsPersonCounter == trust[y][1]){
                    count++;
                }
                x++;
                y++;
//                for (int j = 0; j <= N; j++){
//                    if(j == trust[y][1]){
//                        count++;
//                    }
//                    x++;
//                    y++;
//                }
            }
            //there is a pattern in the test case, When there is a judge it shows up N-1 times in the 'B' position, so
            //if the count == N-1 then it is the judge
            if (count == N-1){
                judge = i;
            }

//            if (townsPersonCounter != varA){
//                inPosAindicator = true;
//                y++;
//            }if (inPosAindicator && i == varB ){
//                count++;
//                x++;
//                //i want to increment the count BUT I want it to be specifically for this var, or does it not matter
//            }
//            else if(count == N-1){
//                judge = i;
//            }
//            else {
//                judge = -1;
//            }
        }
        return judge;
    }

    public static void main(String[] args) {
        judge function = new judge();

        //creating all the "people" in the town
        int [][]townArray = {{1,3},{1,4},{2,3},{2,4},{4,3}};
        System.out.println(Arrays.deepToString(townArray));
        System.out.println(function.findJudge(townArray.length-1,townArray));


    }
}





//        int num = 1;
//        int secNum = 1;
//
//
//        for (int i = 0; i < 4 ; i++) {
//            for (int j = 0; j < 1; j++) {
//                townArray[i][j] = num;
//                townArray[i+1][j+1] =secNum;
//                num ++;
//                secNum ++;
//            }
//        }



//return judge;



//        for(int a = 0; a < N+1;a++){
//           int var = trust[a][1]

////            for (int b = 0; b < N ; b++){

//            int bInColumn = trust[x][y];
//            if (bInColumn == 1){
//                count++;
//            }
//            if (bInColumn == 2){
//                count2++;
//            }
//            if (bInColumn == 3){
//                count3++;
//            }
//            if (bInColumn == 4){
//                count4++;
//            }






//idea:
// the id of the judge can be their index.
//feeling very disjointed set
// the label can be the id -> judge or not judge
//groups can be used
//the group with only one element is the judge automatically


//trust = new int[N][2];//N for the number of people in town, might not use it all spots but creating the room for it
//count how many times a number is in placement b, if it is in placement b, n-1 times its the judge

//        which takes two parameters, in order:
//        ●N: int = number of people in the town
//        ●trust: int [] [] = the trust array, in the form provided above and returns
//        the ID of the judge or -1 if no judge is found.



        //inside the find function:

//trust is an array of arrays
//trust[i] = [a,b]

//NEED SOMEWAY TO REFERENCE THE VALUES OF TRUST TO COMPARE
//        int x = 0;
//        int y = 0;
//       // int bInColumn = trust[x][y];
//        //increment X to go thru all y (b)

//for all people (don't really know how to rep people) check if they are in position a.
//if they are then they are not the judge
// if it isn't in a and is in pos b, its the judge
//also incorprate that it has to be in pos b n-1 times(that a pattern i saw in example)
//        for(n)
//            if(!a)
//                for()