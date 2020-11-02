package jp.co.emozon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.emozon.entity.Player;
import jp.co.emozon.logic.PlayerLogic;

@Service
public class PlayerService {
	@Autowired
	private PlayerLogic playerLogic;

	@Transactional
	public List<Player> findAll() {
		return playerLogic.findAll();
	}

	@Transactional
	public Player findOne(Long id) {
		return playerLogic.findOne(id);
	}

	@Transactional
	public void save(Player player) {
		playerLogic.save(player);
	}

	@Transactional
	public void update(Player player) {
		playerLogic.update(player);
	}

	@Transactional
	public void delete(Long id) {
		playerLogic.delete(id);
	}
}