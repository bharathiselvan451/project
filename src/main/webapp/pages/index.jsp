<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="index.css">
</head>
<body>
    <h1>EMPLOYEE REGISTRATION</h1>
    <form action="submit" method="post">
        <table>
            <tr>
                <td>
                    <label for="firstname">FIRSTNAME</label>
                    
                </td>
                <td>
                    <input type="text" id="firstname" name="firstname" placeholder="enter the firstname" required>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="lastname">LASTNAME</label>
                    
                </td>
                <td>
                    <input type="text" id="lastname" name="lastname" placeholder="enter the lastname" required>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="DOB">DATE.OF.BIRTH</label>
                    
                </td>
                <td>
                    <input type="date" id="DOB" name="DOB" placeholder="enter you date of birth" required>
                </td>
            </tr>
            <tr>
                <td><label>enter sex</label></td>
                <td >
                    
                    
                    <input type="text" id="sex" name="sex" placeholder="enter your sex" required >
                    
                </td>
            </tr>
            <tr>
                <td>
                    <label for="country">country</label>
                    
                </td>
                <td>
                    <input type="text" id="country" name="country" placeholder="enter the country" required>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="city">city</label>
                   
                </td>
                <td>
                    <input type="text" id="city" name="city" placeholder="enter the city" required>
                </td>
            </tr>
            <tr>
                <td>
                    <label for="pincode">pincode</label>
                    
                </td>
                <td>
                    <input type="number" id="pincode" name="pincode" placeholder="enter the pincode" required>
                </td>
            </tr>
            <tr>
                <td colspan="7">
                    <button type="submit">submit</button>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>