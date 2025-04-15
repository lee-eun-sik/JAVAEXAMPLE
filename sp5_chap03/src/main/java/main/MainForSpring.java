package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppCtx;
import spring.ChangePasswordService;
import spring.MemberNotFoundException;
import spring.MemberRegisterService;
import spring.RegisterRequest;

public class MainForSpring {
	private static ApplicationContext ctx = null;
	
	public static void main(String[] args) throws IOException {
		ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("명령어를 입력하세요.");
			String command = reader.readLine();
			//
			printHelp();
		}
	}
	
	private static void processNewCommand(String[] arg) {
		if(arg.length != 5) {
			printHelp();
			return;
		}
		MemberRegisterService regSvc =
				ctx.getBean("memberRegSvc"), MemberRegisterService.class);
				RegisterRequest req = new RegisterRequest();
				req.setEmail(arg[1]);
				//
				if(!req.isPasswordEqualToConfirmPassword()) {
					System.out.println("암호오 확인이 일치하지 않습니다.\n");
					return;
				}
				try {
					regSvc.regist(req);
					System.out.println("등록했습니다.\n");
				} catch (AlreadyExistingMemberException e) {
					System.out.println("이미 존재하는 이메일입니다.\n");
				}
		}
	
	private static void processChangeCommand(String[] arg) {
		if (arg.length != 4) {
			printHelp();
			return;
		}
		ChangePasswordService changePwdSvc =
				ctx.getBean("changePwdSvc", ChangePasswordService.class)
				
	    try {
	    	changePwdSvc.changePassword(arg[1], arg[2], arg[3]);
	    	System.out.println("암호를 변경했습니다.\n");
	    } catch (MemberNotFoundException e) {
	    	System.out.println("존재하지 않는 이메일입니다.\n");
	    } catch (IdPasswordNotMatchingException e) {
	    	System.out.println("이메일과 암호가 일치하지 않습니다.\n");
	    }
	}
}
