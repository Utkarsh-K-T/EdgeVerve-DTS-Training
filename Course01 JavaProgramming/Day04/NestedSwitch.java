import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year of study (1/2/3/4): ");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter a year of study (ai/cs/ece/cv/me/it/entc/other): ");
        String branch = sc.nextLine();

        String yres;
        String bres;

        switch(year){
            case 1:
                yres = "1st";
                switch(branch){
                    case "ai":
                        bres = "ai";
                        break;
                    case "cs":
                        bres = "cs";
                        break;
                    case "ece":
                        bres = "ece";
                        break;
                    case "cv":
                        bres = "cv";
                        break;
                    case "me":
                        bres = "me";
                        break;
                    case "it":
                        bres = "it";
                        break;
                    case "entc":
                        bres = "entc";
                        break;
                    case "other":
                        bres = "other";
                        break;
                    default:
                        bres = "Invalid Branch";
                }
                break;
            case 2:
                yres = "2nd";
                switch(branch){
                case "ai":
                    bres = "ai";
                    break;
                case "cs":
                    bres = "cs";
                    break;
                case "ece":
                    bres = "ece";
                    break;
                case "cv":
                    bres = "cv";
                    break;
                case "me":
                    bres = "me";
                    break;
                case "it":
                    bres = "it";
                    break;
                case "entc":
                    bres = "entc";
                    break;
                case "other":
                    bres = "other";
                    break;
                default:
                    bres = "Invalid Branch";
                }
                break;
            case 3:
                yres = "3rd";
                switch(branch){
                case "ai":
                    bres = "ai";
                    break;
                case "cs":
                    bres = "cs";
                    break;
                case "ece":
                    bres = "ece";
                    break;
                case "cv":
                    bres = "cv";
                    break;
                case "me":
                    bres = "me";
                    break;
                case "it":
                    bres = "it";
                    break;
                case "entc":
                    bres = "entc";
                    break;
                case "other":
                    bres = "other";
                    break;
                default:
                    bres = "Invalid Branch";
                }
                break;
            case 4:
                yres = "4th";
                switch(branch){
                case "ai":
                    bres = "ai";
                    break;
                case "cs":
                    bres = "cs";
                    break;
                case "ece":
                    bres = "ece";
                    break;
                case "cv":
                    bres = "cv";
                    break;
                case "me":
                    bres = "me";
                    break;
                case "it":
                    bres = "it";
                    break;
                case "entc":
                    bres = "entc";
                    break;
                case "other":
                    bres = "other";
                    break;
                default:
                    bres = "Invalid Branch";
                }
                break;

            default:
                yres = "Invalid Year";
                switch(branch){
                case "ai":
                    bres = "ai";
                    break;
                case "cs":
                    bres = "cs";
                    break;
                case "ece":
                    bres = "ece";
                    break;
                case "cv":
                    bres = "cv";
                    break;
                case "me":
                    bres = "me";
                    break;
                case "it":
                    bres = "it";
                    break;
                case "entc":
                    bres = "entc";
                    break;
                case "other":
                    bres = "other";
                    break;
                default:
                    bres = "Invalid Branch";
                } 
        }
        System.out.printf("Year of study : %s\nBranch : %s\n",yres,bres);
        sc.close();
    }
}
