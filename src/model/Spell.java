package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Model class to contain data of a spell in Dungeons & Dragons 5th edition.
 * @author Corbin Staaben
 * @version 1.0
 */
public class Spell {
	private StringProperty name;
	private StringProperty schoolLvl;
	private StringProperty castTime;
	private StringProperty rangeShape;
	private StringProperty components;
	private StringProperty materialComps;
	private StringProperty duration;
	private StringProperty description;
	private StringProperty casterClass;
	private IntegerProperty range;
	private IntegerProperty level;
	
	public Spell() {}
	
	public Spell(String name, String schoolLvl, String castTime, String rangeShape, String components, 
			   String duration, String description, String casterClass, int range, int level) {
		this.name = new SimpleStringProperty(name);
		this.schoolLvl = new SimpleStringProperty(schoolLvl);
		this.castTime = new SimpleStringProperty(castTime);
		this.rangeShape = new SimpleStringProperty(rangeShape);
		this.components = new SimpleStringProperty(components);
		this.duration = new SimpleStringProperty(duration);
		this.description = new SimpleStringProperty(description);
		this.casterClass = new SimpleStringProperty(casterClass);
		this.range = new SimpleIntegerProperty(range);
		this.level = new SimpleIntegerProperty(level);
	}
	
	public String getName() {
		return name.get();
	}
	
	public StringProperty nameProperty() {
		return name;
	}
	
	public void setName(String name) {
		this.name.set(name);
	}
	
	public String getSchoolLvl() {
		return schoolLvl.get();
	}
	
	public StringProperty schoolLvlProperty() {
		return schoolLvl;
	}
	
	public void setSchoolLvl(String schoolLvl) {
		this.schoolLvl.set(schoolLvl);
	}
	
	public String getCastTime() {
		return castTime.get();
	}
	
	public StringProperty castTimeProperty() {
		return castTime;
	}
	
	public void setCastTime(String castTime) {
		this.castTime.set(castTime);
	}
	
	public String getRangeShape() {
		return rangeShape.get();
	}
	
	public StringProperty rangeShapeProperty() {
		return rangeShape;
	}
	
	public void setRangeShape(String rangeShape) {
		this.rangeShape.set(rangeShape);
	}
	
	public String getComponents() {
		return components.get();
	}
	
	public StringProperty componentsProperty() {
		return components;
	}
	
	public void setComponents(String components) {
		this.components.set(components);
	}
	
	public String getDuration() {
		return duration.get();
	}
	
	public StringProperty durationProperty() {
		return duration;
	}
	
	public void setDuration(String duration) {
		this.duration.set(duration);
	}
	
	public String getDescription() {
		return description.get();
	}
	
	public StringProperty descriptionProperty() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description.set(description);
	}
	
	public String getCasterClass() {
		return casterClass.get();
	}
	
	public StringProperty casterClassProperty() {
		return casterClass;
	}
	
	public void setCasterClass(String casterClass) {
		this.casterClass.set(casterClass);
	}
	
	public int getRange() {
		return range.get();
	}
	
	public IntegerProperty rangeProperty() {
		return range;
	}
	
	public void setRange(int range) {
		this.range.set(range);
	}
	
	public int getLevel() {
		return level.get();
	}
	
	public IntegerProperty levelProperty() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level.set(level);
	}
	
	public String getMaterialComps() {
		return materialComps.get();
	}
	
	public StringProperty materialCompsProperty() {
		return materialComps;
	}
	
	public void setMaterialComps(String materialComps) {
		this.materialComps.set(materialComps);
	}
	
	public String getFormattedRange() {
		if(this.rangeShape.equals("target") || this.rangeShape.equals("targets")) {
			return this.range.get() + " feet";
		}
		else {
			return this.range.get() + " " + this.rangeShape.get();
		}
	}
}
