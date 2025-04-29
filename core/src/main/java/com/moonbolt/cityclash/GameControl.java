package com.moonbolt.cityclash;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.Base64Coder;
import com.badlogic.gdx.utils.Json;
import com.moonbolt.cityclash.interfaces.HttpCallback;
import com.moonbolt.cityclash.models.Monster;
import com.moonbolt.cityclash.models.Player;
import com.badlogic.gdx.files.FileHandle;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Net.HttpRequest;
import com.badlogic.gdx.Net.HttpResponse;
import com.badlogic.gdx.Net.HttpResponseListener;
import com.badlogic.gdx.net.HttpRequestBuilder;
import com.badlogic.gdx.net.HttpStatus;

public class GameControl {

	// Manager
	private Json json;
	private FileHandle file;
	private Random randnumber;

	// Actors
	private Player player;
	private Monster monster;
	private ArrayList<Player> lstPlayers;
	
	// Sprite
	private Sprite spr_master;
	private Sprite spr_monster;

	
	// Online
	private String onlineResult = "";
	private ArrayList<Player> lstPlayerOnline;
	private ArrayList<String> lstChats;
	private ArrayList<Monster> lstMonsters;

	// Online Config
	private String lservername = "cityserver.mysql.uhserver.com";
	private String lusername = "citymaster";
	private String lpassword = "P@titos07";
	private String ldbname = "cityserver";
	

	// Texture Atlas
	private TextureAtlas atlas_Char01;
	

	public GameControl() {

		json = new Json();
		randnumber = new Random();

		// Players
		player = new Player();
		lstPlayers = new ArrayList<Player>();
		lstPlayerOnline = new ArrayList<Player>();
		
		// Monster
		monster = new Monster();
		lstMonsters = new ArrayList<Monster>();

		// Chats
		lstChats = new ArrayList<String>();
		lstChats.add("");
		lstChats.add("");
		lstChats.add("");

		// Textures
		atlas_Char01 = new TextureAtlas(Gdx.files.internal("data/assets/skills/effect/casteffect.txt"));
	}
	
	/////////////////////// [ SUMMARY ] ///////////////////
	// [Account] //
	// [Interface] //
	// [Character] //
	// [Monsters] //
	// [Skills] //
	// [Online] //


	// [Account] //
	

		
}
