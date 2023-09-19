package week2Assignments;

public class week2Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a = 150 ;
	int b = 102 ;
	
		boolean result = (a < b && b > 100) ;
		System.out.println(result);
		
		System.out.println( "hello world".charAt(0) != 'H');
		

int c = 105 ;
	
	

String word = "exceptionally" ;
int length = word.length();
System.out.println(length);




int countDown = 10 ;
if (countDown <= 10 && countDown >= 3) {
	  for (int i = countDown ; i >= 1 ; i-- )  {
	      System.out.println( i + "...") ;
	  } System.out.println("We have lift off!") ;
	  
}  else { System.out.println("We have lift off!") ;
	
}

String userWord = "java" ;
int wordLength = userWord.length() ;
int counter = wordLength ;
if (wordLength >= 5) {
do {
	System.out.println(userWord) ;
	wordLength-- ;} while (wordLength >= 1 ) ;
} else { System.out.println(userWord);
}
String longString = "" ;
String userWord1 = "Eclipse" ;
int wordLength1 = userWord1.length() ;
for (int i = 0 ; i < wordLength1 ; i++) {
    longString += userWord1 ;
} System.out.println(longString);


String name = "Tommy";

int age = 52;

if (name == "Tommy") {

  System.out.println("Hi, Tommy!");

} else if (age == 52) {

  System.out.println("52 years old.");

}

System.out.println("Out of conditional.");


double moneyInWallet = 4.50;

double costOfMilk = 1.99;

if (moneyInWallet >= costOfMilk * 2) {

  System.out.println("Let's buy two gallons.");

} else if (moneyInWallet >= costOfMilk) {

  System.out.println("Let's buy one gallon.");

} else {

  System.out.println("Way too expensive!");

}


int day = 6;

int month = 4;

boolean isSummer= month >= 6 && month <= 8 ;
boolean isWeekday = day < 6 ;
if (isSummer || !isWeekday) {
    System.out.println("Definitely going to sleep in!");

 } else {

   System.out.println("Probably need to wake up at a decent time.");

 }


for (int index = 0 ; index <= 100 ; index++) {
	if (!(index % 2 == 0)) {
		System.out.println(index);
	}

			
}
String repeatedString = "" ;
String userWord3 = "Java" ;
int numTimes = 3 ;
for (int i = 1 ; i <= numTimes ; i++) {
	repeatedString += userWord3 ;
}System.out.println(repeatedString);




int num1 = 2 ;
 

if (num1 % 5 == 0 && num1 % 3 == 0){
    System.out.println("FizzBuzz") ;
} else if (num1 % 3 == 0) {
    System.out.println("Fizz") ;
} else if (num1 % 5 == 0) {
   System.out.println("Buzz") ; 
} else System.out.println("Hello world!") ;






int e = 5 ;
int f = 4 ;
int g = 3 ;
int h = 2 ;
int i = 1 ;

int [] newArray = (createArray(e,f,g,h,i)) ;
System.out.println(newArray);


int digits = 12 ;
int sum = 0 ;

while (digits != 0) {
    sum = sum + digits % 10 ;
    digits = digits/10 ;
}System.out.println(sum);

// !, $, %, or &

boolean passwordChecker = true ;

String password = "Shooter689" ;

if (password.length() >= 8 && password.contains("!") || password.contains("$") || password.contains("%") || password.contains("&") ) {
	passwordChecker = true ;
} else {
	passwordChecker = false ;
	
}System.out.println(passwordChecker);



String [] names = new String [5] ;
names [0] = "jose" ;
names [1] = "roberto" ;
names [2] = "theodore" ;
names [3] = "james" ;
names [4] = "fred" ;
int averageNameLength = 0 ;
int totalChar = 0 ;

for (int i1 =0 ; i1 < names.length  ; i1++) {
	 totalChar += names [i1].length() ;
	 averageNameLength = totalChar / names.length ;
}System.out.println(averageNameLength);

String word1 = "hello" ;
char [] eachChar = new char [word1.length()] ;
for (int i1 = 0 ; i1 < word1.length() ; i1++){
    eachChar [i1] += word1.charAt(i1) ;
System.out.println(word1.charAt(i1));
}System.out.println(eachChar [1]);



String [] arr = new String [5] ;
arr [0]= "happy";
arr [1]= "sad";
arr [2]= "uhhh";
arr [3]= "hellp";
arr [4]= "poop";
System.out.println(arr.length);

String [] newArr = new String [3];
newArr [0] = "word1";
newArr [1] = "word2";
newArr [2] = "word3";

String [] bigArr = new String [arr.length + newArr.length] ;
System.out.println(bigArr.length);

for (int i1 = 0 ; i1 < arr.length ; i1++){
    bigArr [i1] = arr [i1] ;
} 
for (int j = arr.length ; j < bigArr.length ; j++) {
	bigArr [j] = newArr [j-arr.length];
}
for (int k = 0 ; k < bigArr.length ; k++){
    System.out.println(bigArr [k]);
}

System.out.println("!!!!!!!BREAK!!!!!!");

int rows = 4;
int columns = 4;

int[][] array = new int[rows][columns];

int value = 1;
for (int i1 = 0; i1 < rows; i1++) {
    for (int j = 0; j < columns; j++) {
        array[i1][j] = value;
        value++;
    }
}

System.out.println("The 2D array is: ");
for (int i1 = 0; i1 < rows; i1++) {
    for (int j = 0; j < columns; j++) {
        System.out.print(array[i1][j] + " ");
    }
    System.out.println();
}



System.out.println("!!!!!!!BREAK!!!!!!");

int x = 10 ;
int y = 15 ;


    int [][] arr1 = new int[x][y];
    int value1 = 1;
   for (int i1 = 0 ; i1 < x ; i1++){
    for (int k = 0 ; k < y ; k++){
    	   array[i1][k] = value1 ;
    	   value1++;
   }
       
  }
   for (int i1 = 0 ; i1 < x ; i1++){
	    
      for (int k = 0 ; k < y ; k++){
    	 System.out.println(arr1 [i1][k] + " "); 
      }
System.out.println();
   } 
   
	}


	
	static int[] createArray(int a, int b, int c, int d, int e) {
	int [] newArray = new int [5] ;
	a =  0 ;
	b =  1 ;
	c =  2 ;
	d =  3 ;
	e =  4 ;
	return newArray ;
	}
  
    }

