package net.lotto.jse.service;

import java.util.List;

import net.lotto.jse.bean.LottoBean;

public interface LottoService {
public void makeRow(LottoBean bean);
public List<LottoBean> showLottos();
public int[] createLotto();
}
