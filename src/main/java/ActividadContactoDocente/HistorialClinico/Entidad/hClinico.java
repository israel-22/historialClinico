package ActividadContactoDocente.HistorialClinico.Entidad;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;



@AllArgsConstructor
@NoArgsConstructor
public class hClinico {

    @NotBlank
    @Pattern(regexp = "^[0-9]{10}$")
    private String cedulaIdentidad;

@Size(min = 3 , max = 50)
private String name;

@NotBlank
@Size(min = 3 , max = 50)
private String lastName;


@NotBlank
@NumberFormat
private String SeguroSocial;
private String ssn;


@NotBlank
@Size(min = 3 , max = 50)
private String bloodType;

@NotBlank
@Size(min = 3 , max = 50)
private String age;


    @NotBlank
    @Size(min = 3 , max = 50)
    private String height;

    @NotBlank
    @Size(min = 3 , max = 50)
    private String weight;

@NotBlank
@Email(message = "El correo es inválido")
private String email;


@DateTimeFormat(pattern = "yyyy-MM-dd")
private String birthDate;

 @NotBlank
 @NumberFormat
 @Pattern(regexp = "^[0-9]{10}$")
 private String phone;

@NotBlank
private String address;

    @NotBlank
    private String gender;

   @Size(min = 10 , max = 150)
    private String city;

    @Size(min = 10 , max = 150)
    private String country;



    /*Al no funcionar bien @Data seprosedio a colocar los Getters y Setters de manera manual*/

    public @NotBlank @Pattern(regexp = "^[0-9]{10}$") String getCedulaIdentidad() {
        return cedulaIdentidad;
    }

    public void setCedulaIdentidad(@NotBlank @Pattern(regexp = "^[0-9]{10}$") String cedulaIdentidad) {
        this.cedulaIdentidad = cedulaIdentidad;
    }

    public @Size(min = 3, max = 50) String getName() {
        return name;
    }

    public void setName(@Size(min = 3, max = 50) String name) {
        this.name = name;
    }

    public @NotBlank @Size(min = 3, max = 50) String getLastName() {
        return lastName;
    }

    public void setLastName(@NotBlank @Size(min = 3, max = 50) String lastName) {
        this.lastName = lastName;
    }

    public @NotBlank String getSeguroSocial() {
        return SeguroSocial;
    }

    public void setSeguroSocial(@NotBlank String seguroSocial) {
        SeguroSocial = seguroSocial;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public @NotBlank @Size(min = 3, max = 50) String getBloodType() {
        return bloodType;
    }

    public void setBloodType(@NotBlank @Size(min = 3, max = 50) String bloodType) {
        this.bloodType = bloodType;
    }

    public @NotBlank @Size(min = 3, max = 50) String getAge() {
        return age;
    }

    public void setAge(@NotBlank @Size(min = 3, max = 50) String age) {
        this.age = age;
    }

    public @NotBlank @Size(min = 3, max = 50) String getHeight() {
        return height;
    }

    public void setHeight(@NotBlank @Size(min = 3, max = 50) String height) {
        this.height = height;
    }

    public @NotBlank @Size(min = 3, max = 50) String getWeight() {
        return weight;
    }

    public void setWeight(@NotBlank @Size(min = 3, max = 50) String weight) {
        this.weight = weight;
    }

    public @NotBlank @Email(message = "El correo es inválido") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank @Email(message = "El correo es inválido") String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public @NotBlank @Pattern(regexp = "^[0-9]{10}$") String getPhone() {
        return phone;
    }

    public void setPhone(@NotBlank @Pattern(regexp = "^[0-9]{10}$") String phone) {
        this.phone = phone;
    }

    public @NotBlank String getAddress() {
        return address;
    }

    public void setAddress(@NotBlank String address) {
        this.address = address;
    }

    public @NotBlank String getGender() {
        return gender;
    }

    public void setGender(@NotBlank String gender) {
        this.gender = gender;
    }

    public @Size(min = 10, max = 150) String getCountry() {
        return country;
    }

    public void setCountry(@Size(min = 10, max = 150) String country) {
        this.country = country;
    }

    public @Size(min = 10, max = 150) String getCity() {
        return city;
    }

    public void setCity(@Size(min = 10, max = 150) String city) {
        this.city = city;
    }
}


