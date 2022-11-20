package serhat.locationcontrolvenus.core.utilities.results;

public class Result {
  private boolean success;
  private String message;

  public Result(Boolean success) {
    this.success = success;
  }

  public Result(Boolean success, String message) {
    this.success = success;
    this.message = message;
  }

  public Boolean isSuccess() {
    return this.success;
  }

  public String getMessage() {
    return this.message;
  }

}
