package com.myspring.model;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestServiceImpl implements GuestService {
	@Autowired
	private GuestDAO dao;
	
	@Override
	public void guestInsert(GuestDTO guest) {
		dao.dao_guestInsert("insertGuest", guest);
	}

	@Override
	public List<GuestDTO> guestList(HashMap<String, String> hm) {
		return dao.dao_guestList(hm);
	}

	@Override
	public int guestCount(HashMap<String, String> hm) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
