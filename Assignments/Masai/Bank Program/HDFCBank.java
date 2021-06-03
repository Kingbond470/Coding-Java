import java.util.ArrayList;
import java.util.Scanner;
public class HDFCBank {
    private static ArrayList<Customer> customerList=new ArrayList<>();
    private static ArrayList<Admin> employeeList=new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("welcome to bannk");
        //or new ArrayList<>();
        enterChoice();
    }
    public static void enterChoice() {
        System.out.println("enter a choice: \n 1.Create an accouunt. \n 2. Login \n 3. Exit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                createAccount();
                break;
            case 2:
                login();
                break;
            case 3:
                exit();
                break;

            default:
                System.out.println("Invalid entry,enter correct choice");
                break;
        }
        sc.close();
    }
        public static void createAccount(){
           // System.out.println("create an account");
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the name");
            String name=sc.nextLine();
            System.out.println("enter the password");
            String password=sc.nextLine();
            System.out.println("enter the account number");
            String accountnumber=sc.nextLine();
            System.out.println("enter the starting or total balance");
            double total_balance=sc.nextDouble();
            sc.nextLine();
            System.out.println("enter the role");
            String role=sc.nextLine();

            if(role.equals("Customer")){    //can also use equalsIgnoreCase()
                Customer customer=new Customer(name,password,accountnumber,total_balance,role);
//                for(Customer c: customerList){
//                    if(c.getAccountNumber().equals(accountnumber)){
//                        System.out.println("alread exist");
//                    }
//                else{
//                    customerList.add(customer);
//                }
//                }

                customerList.add(customer);
                System.out.println("account created successfully");
                System.out.println("total no of custmoer is "+customerList.size());
            }
            else{
                //create an employee
                Admin employee=new Admin(name, password,accountnumber,total_balance, role);
                employeeList.add(employee);
                System.out.println("account created successfully");
                System.out.println("total no of employee is "+employeeList.size());

            }
            enterChoice();
            sc.close();
        }
        public static void employeeLogin(){
        Scanner sc=new Scanner(System.in);
            System.out.println("enter the account number to login");
            String accountNumber=sc.nextLine();
            System.out.println("enter the password");
            String password=sc.nextLine();
            boolean isAccountExist=false;
            Admin employee=null;
            for(int i=0;i<employeeList.size(); i++){
                if(accountNumber.equals(employeeList.get(i).getAccountNumber()) && password.equals((employeeList.get(i).getPassword()))){
                    isAccountExist=true;
                    employee=employeeList.get(i);
                    break;
                }
            }
            if(isAccountExist){
                System.out.println("Login successfully");
              //  handleEmployeeLoginSuccess(customer);
            }
            else{
                System.out.println("Invalid credentials");
            }
            sc.close();
        }
        public static void handleEmployeeLoginSuccess(Admin employee){
            System.out.println("enter the choice : \n 1. Search Total no of accounts in  the bank. \n 2. Search an account \n 3. Show total balance in the bank \n 4. exit");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    totalNumberAccount(employee);
                    break;
                case 2:
                    searchAccount(employee);
                    break;
                case 3:
                    totalBalanceInBank();
                    break;
                case 4: exit();
                break;
                default:
                    System.out.println("Invalid choice, enter correct choice");
                    break;
            }
            sc.close();
        }
        public static void totalNumberAccount(Admin employee){
            System.out.println("Total number of account : "+customerList.size());
        }
        public static void searchAccount(Admin employee){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the account number to search");
        String accountNumber=sc.nextLine();

        for(int i=0;i<customerList.size(); i++){
            if(accountNumber.equals(customerList.get(i).getAccountNumber())){
                System.out.println("Account number found successfully ");
            }
            else{
                System.out.println("account number not found");
            }
        }
        sc.close();
        }
        public static void totalBalanceInBank(){
        Scanner sc=new Scanner(System.in);
        double sum=0;
        System.out.println("The total balance in the bank ");
        for(int i=0; i<customerList.size(); i++){
              //  customer.getTotalBalance();
            double value=  customerList.get(i).getTotalBalance();
            sum=sum+ value;
            }
        }
        public static void login(){
            //System.out.println("login");
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the account number to login");
            String accountNumber=sc.nextLine();
            System.out.println("enter the password");
            String password=sc.nextLine();
            boolean isAccountExist=false;
            Customer customer=null;
            for(int i=0; i<customerList.size(); i++){
                if(accountNumber.equals(customerList.get(i).getAccountNumber()) && password.equals(customerList.get(i).getPassword())){
                    isAccountExist=true;
                    customer=customerList.get(i);
                    break;
                }
            }
            if(isAccountExist){
               // System.out.println("account exist");
                System.out.println("Login successfully");
               handleCustomerLoginSuccess(customer);
            }
            else{
                System.out.println("invalid credentials");
            }
           // handleCustomerLoginSuccess(customer);
            sc.close();
        }
        private static void handleCustomerLoginSuccess(Customer customer){
            System.out.println("enter the choice : \n 1. deposit. \n 2. withdraw \n 3.transfer \n 4.show balance \n 5. exist  ");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    depositAmount(customer);
                    break;
                case 2:
                    withdraw(customer);
                    break;
                case 3:
                    transfer(customer);
                    break;
                case 4:
                    showBalance(customer);
                    break;
                case 5:
                    exit();
                    break;
                default:
                    System.out.println("invalid choice");
                    break;

            }
        }
        public static void depositAmount(Customer customer){
            System.out.println("enter the amount to deposit");
            Scanner sc=new Scanner(System.in);
            double amount=sc.nextDouble();
            customer.setDepositAmount(amount);
            System.out.println("the total balance is "+customer.getTotalBalance());
            sc.close();

        }
        public static void withdraw(Customer customer){

            System.out.println("enter the amount to withdraw");
            Scanner sc=new Scanner(System.in);
            double amount=sc.nextDouble();
            customer.withdrawAmount(amount);
            System.out.println("the total balance is "+customer.getTotalBalance());
            sc.close();
        }
        public static void transfer(Customer customer){

            System.out.println("enter the amount to deposit");
            Scanner sc=new Scanner(System.in);
            String accountNumber=sc.nextLine();
            double amount=sc.nextDouble();
            customer.transfer(accountNumber,amount);
            System.out.println("the total balnace is "+customer.getTotalBalance());
            handleCustomerLoginSuccess(customer);
            sc.close();

    }
    public static void showBalance(Customer customer){
        System.out.println("the total balance is "+customer.getTotalBalance());

    }
        public static void exit(){
            System.out.println("exit");
            System.exit(0);
        }

}
