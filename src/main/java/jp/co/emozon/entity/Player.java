package jp.co.emozon.entity;

import lombok.Data;

@Data
public class Player {
	private Long id;
	private String name;
	private String team;
	private String position;
}