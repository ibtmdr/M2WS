package fr.m2i.m2ws.todoList;

public class Todo {
	private String Titre;
	private String Description;
	private Urgence urg;
	public String getTitre() {
		return Titre;
	}
	public void setTitre(String titre) {
		Titre = titre;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Urgence getUrg() {
		return urg;
	}
	public void setUrg(Urgence urg) {
		this.urg = urg;
	}
	public Todo(String titre, String description, Urgence urg) {
		super();
		Titre = titre;
		Description = description;
		this.urg = urg;
	}

	public Todo(){

	}
	@Override
	public String toString() {
		return "Todo [Titre=" + Titre + ", Description=" + Description + ", urg=" + urg + "]";
	}
	

}
