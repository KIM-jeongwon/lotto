package net.lotto.jse.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.lotto.jse.bean.LottoBean;
import net.lotto.jse.service.LottoService;

public class LottoServiceImpl implements LottoService {
	private List<LottoBean> lottos;

	public LottoServiceImpl() {
		lottos = new ArrayList<>();
	}

	@Override
	public void makeRow(LottoBean bean) {
		LottoBean lotto = null;
		if (Integer.parseInt(bean.getMoney()) > 5000) {
			bean.setMoney("5000");
		}
		String res = "";
		for (int i = 0; i < Integer.parseInt(bean.getMoney())/1000; i++) {
			int[] t = createLotto();
			lotto = new LottoBean();
			res += t[i]+",";
			lotto.setNum(res);
			lottos.add(lotto);
		}
		System.out.println(lottos);
	}
	 @Override
	public int[] createLotto() {
		int[] lotto = new int[6];
		for(int i = 0; i<6; i++) {
			int num = (int)(Math.random()*45)+1;
			boolean exist = false;
			for(int j =0;j< lotto.length;j++) {
				if(num == lotto[j]) {
					exist = true;
					break;
				}
				if(exist) {
					i--;
					continue;
				}else {
					lotto[i]=num;
				}
			}
		}
			return lotto;
	}
	@Override
	public List<LottoBean> showLottos() {
		return lottos;
	}
}
