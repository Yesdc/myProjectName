package com.human.ex1;
//
class User{
		public static final int LOGIN_LOG_OFF=0;
		public static final int LOGIN_NOMAL_USER=1;
		public static final int LOGIN_ADMIN_USER=2;
	
		public int loginState=LOGIN_NOMAL_USER;
		public String id="user1";
		public String pw="user1";
		public int account=0;
		public User() {}
		
		public User(int loginState, String id, String pw, int account) {
			super();
			this.loginState = loginState;
			this.id = id;
			this.pw = pw;
			this.account = account;
		}

		@Override
		public String toString() {
			return "User [loginState=" + loginState + ", id=" + id + ", pw=" + pw + ", account=" + account + "]";
		}
		
		
}


public class bank2 {
	
	public static void main(String[] args) {
		
		User[] userArray=new User[10];
		int userCount=0;
		
		userArray[0]=new User(User.LOGIN_NOMAL_USER,"user1","user1",0);
		userCount++;
		
		
		userArray[userCount++]=new User(User.LOGIN_NOMAL_USER,"user2","user2",0);
		userArray[userCount++]=new User(User.LOGIN_NOMAL_USER,"user3","user3",0);
		userArray[userCount++]=new User(User.LOGIN_ADMIN_USER,"admin1","admin1",0);
		userArray[userCount++]=new User(User.LOGIN_ADMIN_USER,"admin2","admin2",0);
			
		
		
		
		String inputId="";
		String inputPw="";
	
		boolean isFlag=true;
		while(isFlag) {
			System.out.println("아이디 pw를 입력 'exit'종료>> ");
			System.out.println("아이디입력>>");
			inputId=new java.util.Scanner(System.in).nextLine();
			System.out.println("pw입력>>");
			inputPw=new java.util.Scanner(System.in).nextLine();
			
			
//			User nowUser=userFind(inputId,inputPw,userArray);
			User nowUser=null;
			for(int i=0;i<userCount;i++) {
				if(userArray[i].id.equals(inputId)&&userArray[i].pw.equals(inputPw)) {
					nowUser=userArray[i];
				}
			}
			
			
			if(nowUser!=null) {
				switch(nowUser.loginState) {
				case User.LOGIN_LOG_OFF:
					System.out.println("사용할수 없는 ID입니다. -로그아웃상태");
					break;
				case User.LOGIN_NOMAL_USER:
					boolean isNormalUserFlag=true;
					while(isNormalUserFlag) {
						System.out.println("사용자:"+nowUser.id);
						System.out.println("1.입금 2.출금 3.확인 4.종료");	
						switch(new java.util.Scanner(System.in).nextLine()) {
						case "1":
							System.out.println("입금액>>");
							int insert=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
							nowUser.account=nowUser.account+insert;
							break;
						case "2":
							System.out.println("출금액>>");
							int withdraw=Integer.parseInt(new java.util.Scanner(System.in).nextLine());
							nowUser.account=nowUser.account-withdraw;
							break;
						case "3":
							System.out.println("현재 금액>>"+nowUser.account);
							
							break;
						default:
							System.out.println("사용종료");
							isNormalUserFlag=false;
						}	
					}
					break;
				case User.LOGIN_ADMIN_USER:
					boolean isAdminUserFlag=true;
					while(isAdminUserFlag) {
						System.out.println("사용자:"+nowUser.id);
						System.out.println("1.계정추가 2.계정삭제 3.아이디변경 4.모든 사용자출력 6.종료");
						String str=new java.util.Scanner(System.in).nextLine();
						switch(str) {
						case "1":
							User u=new User();
							System.out.println("1.일반사용자계정 추가 2.관리자계정 추가>>");
							str=new java.util.Scanner(System.in).nextLine();
							if(str.equals(1)) {	
								u.loginState=User.LOGIN_NOMAL_USER;
							}else {
								u.loginState=User.LOGIN_ADMIN_USER;
							}
							System.out.println("id입력>>");
							u.id=new java.util.Scanner(System.in).nextLine();
							System.out.println("pw입력>>");
							u.pw=new java.util.Scanner(System.in).nextLine();	
							u.account=0;
							userArray[userCount++]=u;
							
							break;
						case "2":
							User findUser=null;
							System.out.println("id입력>>");
							String findId=new java.util.Scanner(System.in).nextLine();
							System.out.println("pw입력>>");
							String findPw=new java.util.Scanner(System.in).nextLine();	
						
							for(int i=0;i<userCount;i++) {
								if(userArray[i].id.equals(findId)&&userArray[i].pw.equals(findPw)) {
									findUser=userArray[i];
									for(int j=i;j<userCount-1;j++) {
										userArray[j]=userArray[j+1];
									}
									userCount--;
									break;
									
								}
							}
							if(findUser!=null) {
								System.out.println("다음데이터가 삭제됨");
								System.out.println(findUser);
							}else {
								System.out.println("데이터를 찾지못함");
								
							}
							break;
						case "3":
							System.out.println("ID변경작업");
							System.out.print("변경할아이디입력>>");
							String fId=new java.util.Scanner(System.in).nextLine();	
							System.out.print("새로운아이디입력>>");
							String newId=new java.util.Scanner(System.in).nextLine();	
							System.out.print("패스워드입력>>");
							String fPw=new java.util.Scanner(System.in).nextLine();				
														
							for(int i=0;i<userCount;i++) {
							  if(userArray[i].id.equals(fId)&&userArray[i].pw.equals(fPw)) {
							    userArray[i].id=newId;									
							    break;
							  }
							}
							System.out.println("ID가 변경되었습니다");

							break;
						case "4":
							System.out.println("사용자정보출력");
							for(int i=0;i<userCount;i++) {
								System.out.println(userArray[i]);
							}
							break;
						default:
							System.out.println("사용종료");
							isAdminUserFlag=false;
						}
						
					}
					
					break;
				}
			}else if(inputId.equals("exit")) {
				System.out.println("프로그램종료");
				isFlag=false;
			}else {
				System.out.println("잘못 입력 하였습니다");
				
			}
		}
		
		//
		
		
	
		
		
	}

}
