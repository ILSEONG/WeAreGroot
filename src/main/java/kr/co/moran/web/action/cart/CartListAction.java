package kr.co.moran.web.action.cart;

import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.moran.web.action.Action;
import kr.co.moran.web.dao.CartDAO;
import kr.co.moran.web.vo.cartTest.CartVO;
import kr.co.moran.web.vo.cartTest.ProductCartVO;
import kr.co.moran.web.vo.productTest.ProductVO;

public class CartListAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		
		CartDAO dao = new CartDAO();
		List<ProductCartVO> vo = dao.selectCartList(9);
		req.setAttribute("cartVO", vo);
		
		return "/jsp/cart/cartList.jsp";
	}

}