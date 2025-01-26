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
@Data
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

}


