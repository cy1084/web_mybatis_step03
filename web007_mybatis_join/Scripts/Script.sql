SELECT PLAYER_ID ,PLAYER_NAME ,BACK_NO , "POSITION" ,
		TEAM_NAME, REGION_NAME , ADDRESS , HOMEPAGE
 FROM PLAYER p JOIN TEAM t 
 USING(TEAM_ID);