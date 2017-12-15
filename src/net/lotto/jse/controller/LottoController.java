package net.lotto.jse.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;

import net.lotto.jse.bean.LottoBean;
import net.lotto.jse.constants_pool.Value;
import net.lotto.jse.service.LottoService;
import net.lotto.jse.serviceImpl.LottoServiceImpl;

public class LottoController {
	public static void main(String[] args) {
		LottoService service = new LottoServiceImpl();
		LottoBean bean = new LottoBean();
		while (true) {
			switch (JOptionPane.showInputDialog(Value.MENU)) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				bean.setMoney(JOptionPane.showInputDialog("구매금액을 입력하세요."));
				break;
			case "2":
				//String message = service.showLottos().toString();
				JOptionPane.showMessageDialog(null, service.showLottos().toString());
				break;
			case "3":
				File f = new File("C:\\Users\\1027\\jse\\eclipse\\workspace\\lotto\\lotto.txt");
				BufferedWriter bw = null;
				try {
					bw = new BufferedWriter(new FileWriter(f));
					bw.write("");
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						bw.flush();
						bw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
// 얼마치하겠습니까
// 3000
// 랜덤숫자 1~45 - 6개번호
// count-- 중복불가
// 1.구매금액확인 2.로또생성 3.로또번호출력
// arrayList
//
