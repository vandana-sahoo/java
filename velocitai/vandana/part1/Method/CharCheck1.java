class CharCheck{
 public static void main(String[] agrs){
 checkuppercase('A');
 checkuppercase('b');
// printing statmt System.out.println(checkuppercase('A'));
//char var1 = checkuppercase('A');
}

public static char checkuppercase(char ch){

if(ch >= 'A' && ch <= 'Z'){
System.out.println(ch + " is uppercase");
}
else{System.out.println(ch + " is not uppercase");
}
System.out.println("hii");
checklowercase('p');
return ch;

}

public static char checklowercase(char chh){

if(chh >= 'a' && chh<= 'z'){
System.out.println(chh + " is  not uppercase");
}
else{System.out.println(chh + " is  uppercase");
}
return chh;
}

}

   