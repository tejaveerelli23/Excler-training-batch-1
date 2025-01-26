

import java.util.*;

class PS002{
    int multiple(int a){
        if(a >0){
            return (a/100+1)*100;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PS002 PS = new PS002();
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Output: "+  PS.multiple(a));
    }
}
}
