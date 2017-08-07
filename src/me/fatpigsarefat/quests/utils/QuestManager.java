package me.fatpigsarefat.quests.utils;

import java.util.ArrayList;
import java.util.List;

import me.fatpigsarefat.quests.Quests;

public class QuestManager {

	private ArrayList<Quest> quests = new ArrayList<Quest>();
	
	public void registerQuest(Quest quest) {
		quests.add(quest);
	}
	
	public void unregisterAllQuests() {
		quests.clear();
	}
	
	public ArrayList<Quest> getQuests() {
		return quests;
	}
	
	public List<String> getBlacklistedWorlds() {
		return (Quests.getInstance().getConfig().getStringList("blacklisted-worlds"));
	}
	
	public ArrayList<Quest> getQuestsByType(QuestType questType) {
		ArrayList<Quest> questsOfType = new ArrayList<Quest>();
		for (Quest q : quests) {
			if (q.getQuestType() == questType) {
				questsOfType.add(q);
			}
		}
		return questsOfType;
	}
	
	public Quest getQuestById(String nameId) {
		for (Quest q : quests) {
			if (q.getNameId().equals(nameId)) {
				return q;
			}
		}
		return null;
	}

}
