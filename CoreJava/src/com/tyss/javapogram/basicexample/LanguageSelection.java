package com.tyss.javapogram.basicexample;

 public class LanguageSelection {
    public static void main(String[] args) {
		 int input=2;
		 
		 switch (input) {
		case 1:
			System.out.println("selected language is Kannada");
			break;
        case 2:
        	System.out.println("selected language is English"); 
			break;
        case 3:
        	System.out.println("selected language is Hindi");
			break;
          case 4:
        	  System.out.println("selected language is Tamil");
			break;

		default:
			System.out.println("Invalid Option"); 
			break;
		}
	}
}
