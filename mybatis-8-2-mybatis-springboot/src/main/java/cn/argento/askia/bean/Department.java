package cn.argento.askia.bean;


public class Department {

  private long id;
  private String name;
  private long parentId;
  private String depPath;
  private long enabled;
  private long isParent;

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Department{");
    sb.append("id=").append(id);
    sb.append(", name='").append(name).append('\'');
    sb.append(", parentId=").append(parentId);
    sb.append(", depPath='").append(depPath).append('\'');
    sb.append(", enabled=").append(enabled);
    sb.append(", isParent=").append(isParent);
    sb.append('}');
    return sb.toString();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public String getDepPath() {
    return depPath;
  }

  public void setDepPath(String depPath) {
    this.depPath = depPath;
  }


  public long getEnabled() {
    return enabled;
  }

  public void setEnabled(long enabled) {
    this.enabled = enabled;
  }


  public long getIsParent() {
    return isParent;
  }

  public void setIsParent(long isParent) {
    this.isParent = isParent;
  }

}
