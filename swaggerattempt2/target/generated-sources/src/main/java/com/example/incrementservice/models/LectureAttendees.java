package com.example.incrementservice.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LectureAttendees
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-07-23T13:59:52.820091+02:00[Africa/Johannesburg]")


public class LectureAttendees   {
  @JsonProperty("studentNumber")
  private Integer studentNumber = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("check-in")
  private Boolean checkIn = null;

  public LectureAttendees studentNumber(Integer studentNumber) {
    this.studentNumber = studentNumber;
    return this;
  }

  /**
   * Get studentNumber
   * @return studentNumber
   **/
  @Schema(example = "218014208", description = "")
  
    public Integer getStudentNumber() {
    return studentNumber;
  }

  public void setStudentNumber(Integer studentNumber) {
    this.studentNumber = studentNumber;
  }

  public LectureAttendees name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "Usain Bolt", description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LectureAttendees checkIn(Boolean checkIn) {
    this.checkIn = checkIn;
    return this;
  }

  /**
   * Get checkIn
   * @return checkIn
   **/
  @Schema(example = "true", description = "")
  
    public Boolean isCheckIn() {
    return checkIn;
  }

  public void setCheckIn(Boolean checkIn) {
    this.checkIn = checkIn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LectureAttendees lectureAttendees = (LectureAttendees) o;
    return Objects.equals(this.studentNumber, lectureAttendees.studentNumber) &&
        Objects.equals(this.name, lectureAttendees.name) &&
        Objects.equals(this.checkIn, lectureAttendees.checkIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentNumber, name, checkIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LectureAttendees {\n");
    
    sb.append("    studentNumber: ").append(toIndentedString(studentNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    checkIn: ").append(toIndentedString(checkIn)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
