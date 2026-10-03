import java.util.*;
class Batch{
	// Batch status
    public static final int ENROLLMENTOPEN = 1;
    public static final int ENROLLMENTCLOSED = 0;
	
	private int batchName;
	private int batchStatus;
	private int batchMaxCount;
	
	public Batch(int batchName, int batchStatus, int batchMaxCount){
		setBatchName(batchName);
		setBatchStatus(batchStatus);
		setBatchMaxCount(batchMaxCount);
	}
	
	public void setBatchName(int batchName){
		this.batchName = batchName;
	}
	
	public void setBatchStatus(int batchStatus){
		this.batchStatus = batchStatus;
	}
	
	public void setBatchMaxCount(int batchMaxCount){
		this.batchMaxCount = batchMaxCount;
	}
	
	public int getBatchName(){
		return batchName;
	}
	
	public int getBatchStatus(){
		return batchStatus;
	}
	
	public int getBatchMaxCount(){
		return batchMaxCount;
	}
}

class Student{
	private String regNo;
	private String nic;
	private String name;
	private int prfMark;
	private int dbmsMark;
	
	public Student(String regNo, String nic, String name, int prfMark, int dbmsMark){
		setRegNo(regNo);
		setNic(nic);
		setName(name);
		setPrfMark(prfMark);
		setDbmsMark(dbmsMark);
	}
	
	public void setRegNo(String regNo){
		this.regNo = regNo;
	}
	
	public void setNic(String nic){
		this.nic = nic;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPrfMark(int prfMark){
		this.prfMark = prfMark;
	}
	
	public void setDbmsMark(int dbmsMark){
		this.dbmsMark = dbmsMark;
	}
	
	public String getRegNo(){
		return regNo;
	}
	
	public String getNic(){
		return nic;
	}
	
	public String getName(){
		return name;
	}
	
	public int getPrfMark(){
		return prfMark;
	}
	
	public int getDbmsMark(){
		return dbmsMark;
	}
}

class StudentManagementSystem {
    // Batch data
    public static Batch[] batchArray={
		new Batch(105, 0, 25),
		new Batch(106, 0, 25),
		new Batch(107, 0, 25),
		new Batch(108, 0, 25),
		new Batch(109, 1, 30),
		new Batch(110, 1, 30)
	};
    
    // Student data
    public static Student[] studentArray={
		new Student("PR24105001", "199501012345", "Gunawardena Weerasinghe", 85, 66),
		new Student("PR24105002", "199503153872", "Senanayake Silva", 39, 45),
		new Student("PR24105003", "199506202198", "Silva Kumara", -1, 93),
		new Student("PR24105004", "199509102983", "Kumara Herath", 72, 58),
		new Student("PR24105005", "199511258739", "Rathnayake Herath", 44, -1),
		new Student("PR24105006", "199512303498", "Wijesinghe Bandara", 91, 37),
		new Student("PR24105007", "199502183764", "Rajapaksha Herath", 60, 88),
		new Student("PR24105008", "199504223198", "Senanayake Karunaratne", 38, 21),
		new Student("PR24105009", "199508153210", "Karunaratne Jayasinghe", 95, 79),
		new Student("PR24105010", "199510293417", "Gunawardena Silva", 49, 40),
		new Student("OR24105011", "199601102375", "Weerasinghe Rajapaksha", -1, 76),
		new Student("OR24105012", "199604182938", "Silva Rathnayake", 67, 54),
		new Student("OR24105013", "199606243879", "Fernando Perera", 23, -1),
		new Student("OR24105014", "199608142178", "Kumara Abeysekera", 58, 69),
		new Student("OR24105015", "199610312475", "Ekanayake Rathnayake", 88, 92),
		new Student("PR24105016", "199611173452", "Herath Gunawardena", 81, 25),
		new Student("PR24105017", "199603293481", "Abeysekera Silva", 73, 84),
		new Student("PR24105018", "199605083217", "Weerasinghe Silva", 29, 33),
		new Student("OR24105019", "199607232198", "Jayasinghe Dias", 62, 60),
		new Student("OR24105020", "199609192375", "Bandara Rathnayake", -1, 71),
		new Student("PR24105021", "199701212483", "Silva Perera", 79, 59),
		new Student("PR24105022", "199703132487", "De Silva Dias", 53, -1),
		new Student("OR24105023", "199706253478", "Abeysekera Jayasinghe", 94, 98),
		new Student("OR24105024", "199708083298", "Rajapaksha Senanayake", 47, 27),
		new Student("PR24105025", "199710243651", "Kumara Karunaratne", 35, 48),
		new Student("PR24106001", "199712152983", "Silva Abeysekera", 93, 35),
		new Student("PR24106002", "199702182734", "Jayasinghe Bandara", 15, 91),
		new Student("PR24106003", "199704293187", "Rathnayake Kumara", -1, 60),
		new Student("PR24106004", "199705142375", "Weerasinghe Rajapaksha", 82, -1),
		new Student("PR24106005", "199709083751", "Senanayake Herath", 45, 72),
		new Student("PR24106006", "199801032874", "Perera Ekanayake", 88, 49),
		new Student("PR24106007", "199803232871", "Herath Jayasinghe", 23, 26),
		new Student("PR24106008", "199806193428", "Kumara Gunawardena", 79, 80),
		new Student("PR24106009", "199808013764", "Abeysekera Silva", 37, 14),
		new Student("PR24106010", "199810242374", "Dias Fernando", -1, 89),
		new Student("OR24106011", "199812302984", "Karunaratne Weerasinghe", 68, 67),
		new Student("OR24106012", "199802152348", "Ekanayake Bandara", 100, -1),
		new Student("OR24106013", "199805213471", "Rajapaksha Kumara", 59, 31),
		new Student("OR24106014", "199807172398", "Silva De Silva", 29, 94),
		new Student("OR24106015", "199811283472", "Gunawardena Rathnayake", 92, 53),
		new Student("PR24106016", "199901122471", "Bandara Karunaratne", 12, 78),
		new Student("PR24106017", "199903052984", "Fernando Perera", 77, 5),
		new Student("PR24106018", "199906213874", "De Silva Silva", 38, 90),
		new Student("OR24106019", "199908093412", "Rajapaksha Gunawardena", 66, 24),
		new Student("OR24106020", "199910273894", "Herath Weerasinghe", 9, 86),
		new Student("PR24106021", "199912153482", "Karunaratne Dias", 84, 39),
		new Student("PR24106022", "199902202394", "Jayasinghe Silva", 51, -1),
		new Student("OR24106023", "199904163874", "Senanayake Abeysekera", 32, 61),
		new Student("OR24106024", "199907293481", "Silva Jayasinghe", -1, 73),
		new Student("PR24106025", "199911083479", "Rathnayake Kumara", 97, 100),
		new Student("PR24107001", "200001112374", "Gunawardena Kumara", 95, 38),
		new Student("PR24107002", "200003143478", "Rajapaksha Silva", -1, 91),
		new Student("PR24107003", "200006293874", "Perera Jayasinghe", 63, -1),
		new Student("PR24107004", "200008103471", "Silva Ekanayake", 88, 74),
		new Student("PR24107005", "200010252984", "Dias Senanayake", 32, 55),
		new Student("PR24107006", "200012043894", "Herath Abeysekera", 76, 82),
		new Student("PR24107007", "200002193874", "Rathnayake Fernando", 97, 66),
		new Student("PR24107008", "200004212374", "Kumara Herath", 54, 49),
		new Student("PR24107009", "200005183492", "Weerasinghe Silva", -1, 99),
		new Student("PR24107010", "200007153871", "Senanayake Karunaratne", 23, 13),
		new Student("OR24107011", "200101232984", "Abeysekera Silva", 90, 80),
		new Student("OR24107012", "200103083471", "Bandara Gunawardena", 35, 70),
		new Student("OR24107013", "200106273894", "Karunaratne Weerasinghe", 81, 93),
		new Student("OR24107014", "200108123984", "Perera Herath", 61, 36),
		new Student("OR24107015", "200110043728", "Fernando Dias", 44, 59),
		new Student("PR24107016", "200112213874", "Weerasinghe Gunawardena", 67, 85),
		new Student("PR24107017", "200102253471", "Rathnayake Kumara", 100, 47),
		new Student("PR24107018", "200104103874", "Senanayake Fernando", 17, 90),
		new Student("OR24107019", "200105293784", "Silva Bandara", 85, -1),
		new Student("OR24107020", "200107202983", "Herath Rajapaksha", 29, 22),
		new Student("PR24107021", "200201013874", "Kumara Jayasinghe", 70, 77),
		new Student("PR24107022", "200203253471", "Abeysekera Perera", 42, 34),
		new Student("OR24107023", "200206143874", "Rathnayake Jayasinghe", -1, 63),
		new Student("OR24107024", "200208083471", "Kumara Weerasinghe", 60, 100),
		new Student("PR24107025", "200210293874", "Rajapaksha Ekanayake", 86, 29),
		new Student("PR24108001", "200212183471", "Fernando Rajapaksha", 86, 79),
		new Student("PR24108002", "200202103874", "Silva Gunawardena", 57, 62),
		new Student("PR24108003", "200204123894", "Perera Wijesinghe", 91, 87),
		new Student("PR24108004", "200205283471", "Herath Abeysekera", 35, -1),
		new Student("PR24108005", "200207153874", "Rajapaksha Ekanayake", -1, 54),
		new Student("PR24108006", "200301093874", "Karunaratne Silva", 76, 46),
		new Student("PR24108007", "200303283471", "Weerasinghe Fernando", 48, 99),
		new Student("PR24108008", "200306153874", "Silva Bandara", 94, 39),
		new Student("PR24108009", "200308123471", "Abeysekera Weerasinghe", 23, 70),
		new Student("PR24108010", "200310083874", "Kumara Karunaratne", 69, -1),
		new Student("OR24108011", "200312243471", "Dias Rajapaksha", -1, 75),
		new Student("OR24108012", "200302273874", "Herath Perera", 80, 83),
		new Student("OR24108013", "200304203471", "Rathnayake Gunawardena", 55, 58),
		new Student("OR24108014", "200305123874", "Ekanayake Jayasinghe", 88, 92),
		new Student("OR24108015", "200307213471", "Gunawardena Silva", 32, 30),
		new Student("PR24108016", "200401153874", "Rajapaksha Perera", 100, 91),
		new Student("PR24108017", "200403123471", "Karunaratne Jayasinghe", 67, 40),
		new Student("PR24108018", "200406293874", "Weerasinghe Abeysekera", 43, 63),
		new Student("OR24108019", "200408083471", "Rathnayake Fernando", -1, 95),
		new Student("OR24108020", "200410213874", "Kumara Herath", 90, 68),
		new Student("PR24108021", "200412153471", "Silva Weerasinghe", 60, -1),
		new Student("PR24108022", "200402203874", "Herath Karunaratne", 77, 66),
		new Student("OR24108023", "200404273471", "Abeysekera Silva", 25, 21),
		new Student("OR24108024", "200405143874", "Gunawardena Ekanayake", 71, 88),
		new Student("PR24108025", "200407183471", "Weerasinghe Kumara", 84, 37),
		new Student("PR24109001", "200501023874", "Weerasinghe Kumara", 92, 67),
		new Student("PR24109002", "200503193471", "Rajapaksha Abeysekera", 68, 91),
		new Student("PR24109003", "200506153874", "Gunawardena Perera", 59, 85),
		new Student("PR24109004", "200508213471", "Karunaratne Silva", 85, 73),
		new Student("PR24109005", "200510083874", "Herath Wijesinghe", 63, 70),
		new Student("PR24109006", "200512293471", "Rathnayake Ekanayake", 76, 63),
		new Student("PR24109007", "200502123874", "Silva Fernando", 91, 76),
		new Student("PR24109008", "200504153471", "Abeysekera Rajapaksha", 70, 88),
		new Student("PR24109009", "200505283874", "Fernando Bandara", 84, 55),
		new Student("PR24109010", "200507173471", "Perera Herath", 63, 64),
		new Student("OR24109011", "200203456782", "Weerasinghe Jayasinghe", 72, 79),
		new Student("OR24109012", "200305678901", "Silva Karunaratne", 89, 80),
		new Student("OR24109013", "199601234567", "Rathnayake Gunawardena", 45, 59),
		new Student("OR24109014", "199511223344", "Herath Kumara", 81, 92),
		new Student("OR24109015", "200412345678", "Abeysekera Silva", 77, 68),
		new Student("PR24109016", "200512345678", "Ekanayake Bandara", 68, 100),
		new Student("PR24109017", "199909876543", "Rajapaksha Fernando", 63, 77),
		new Student("PR24109018", "199812346789", "Gunawardena Weerasinghe", 88, 83),
		new Student("OR24109019", "200010203040", "Kumara Karunaratne", 75, 45),
		new Student("OR24109020", "200608789012", "Silva Dias", 90, 62),
		new Student("PR24109021", "200012345678", "Perera Weerasinghe", 57, 66),
		new Student("PR24109022", "199812345679", "Karunaratne Rajapaksha", 79, 59),
		new Student("OR24109023", "199902345678", "Jayasinghe Silva", 92, 78),
		new Student("OR24109024", "199712345670", "Rathnayake Perera", 62, 85),
		new Student("PR24109025", "200102345671", "Silva Ekanayake", 100, 56),
		new Student("PR24110001", "200203456782", "Silva Karunaratne", -2, -2),
		new Student("PR24110002", "200305678901", "Herath Fernando", -2, -2),
		new Student("PR24110003", "199601234567", "Kumara Jayasinghe", -2, -2),
		new Student("PR24110004", "199511223344", "Weerasinghe Perera", -2, -2),
		new Student("PR24110005", "200412345678", "Abeysekera Rajapaksha", -2, -2),
		new Student("PR24110006", "200512345678", "Rathnayake Karunaratne", -2, -2),
		new Student("PR24110007", "199909876543", "Ekanayake Bandara", -2, -2),
		new Student("PR24110008", "199812346789", "Gunawardena Perera", -2, -2),
		new Student("PR24110009", "200010203040", "Silva Wijesinghe", -2, -2),
		new Student("PR24110010", "200608789012", "Rajapaksha Jayasinghe", -2, -2),
		new Student("OR24110011", "200012345678", "Rathnayake Fernando", -2, -2),
		new Student("OR24110012", "199812345679", "Karunaratne Kumara", -2, -2),
		new Student("OR24110013", "199902345678", "Perera Silva", -2, -2),
		new Student("OR24110014", "199712345670", "Gunawardena Ekanayake", -2, -2),
		new Student("OR24110015", "200102345671", "Bandara Rajapaksha", -2, -2),
		new Student("PR24110016", "200203456782", "Silva Herath", -2, -2),
		new Student("PR24110017", "200305678901", "Rathnayake Weerasinghe", -2, -2),
		new Student("PR24110018", "199601234567", "Perera Gunawardena", -2, -2),
		new Student("OR24110019", "199511223344", "Herath Karunaratne", -2, -2),
		new Student("OR24110020", "200412345678", "Silva Rajapaksha", -2, -2),
		new Student("PR24110021", "200203456782", "Ekanayake Kumara", -2, -2),
		new Student("PR24110022", "200305678901", "Bandara Herath", -2, -2),
		new Student("OR24110023", "199601234567", "Weerasinghe Rajapaksha", -2, -2),
		new Student("OR24110024", "199511223344", "Karunaratne Abeysekera", -2, -2),
		new Student("PR24110025", "200412345678", "Perera Dias", -2, -2)
	};
	
	
    //======================== HOME PAGE ========================
    
    // home
    public static void homePage() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t   iCET Student Management System   \t\t|");
        System.out.println("-----------------------------------------------------------------\n");
        System.out.println("\t\t[1] Student Management");
        System.out.println("\n\t\t[2] Batch Management ");
        System.out.println("\n\t\t[3] Grade Management");
        System.out.println("\n\t\t[4] Report Generator");
        System.out.println("\n\t\t[5] Exit");

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("\n\nEnter an option to continue > ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    clearConsole();
                    studentManagement();
                    break;
                case 2:
                    clearConsole();
                    batchManagement();
                    break;
                case 3:
                    clearConsole();
                    gradeManagement();
                    break;
                case 4:
                    clearConsole();
                    reportGenerator();
                    break;
                case 5:
                    exit();
                    break;
            }
        }while(true);
    }

	// console clear
    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
            // Handle any exceptions.
        }
    }
	
	
	//================= Home menu items =================

    // Student Management
    public static void studentManagement() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tStudent Management\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");
        System.out.println("\t\t[1] Add Student");
        System.out.println("\n\t\t[2] Update Student ");
        System.out.println("\n\t\t[3] View Student Profile");
        System.out.println("\n\t\t[4] Delete Student Profile");
        System.out.println("\n\t\t[5] Home");
        System.out.println("\n\t\t[6] Exit");

		Scanner input = new Scanner(System.in);
        do {
            System.out.print("\n\nEnter an option to continue > ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    clearConsole();
                    addStudent();
                    break;
                case 2:
                    clearConsole();
                    updateStudent();
                    break;
                case 3:
                    clearConsole();
                    viewStudentProfile();
                    break;
                case 4:
                    clearConsole();
                    deleteStudentProfile();
                    break;
                case 5:
					clearConsole();
					homePage();
                    break;
                case 6:
                    exit();
                    break;
            }
        } while (true);

    }
	
	// Batch Management
    public static void batchManagement() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tBatch Management\t\t\t|");
        System.out.println("-------------------------------------------------------------------------\n");
        System.out.println("\t\t[1] Add Batch");
        System.out.println("\n\t\t[2] Update Batch");
        System.out.println("\n\t\t[3] View Batches");
        System.out.println("\n\t\t[4] Home");
        System.out.println("\n\t\t[5] Exit");

		Scanner input = new Scanner(System.in);
        do {
            System.out.print("\n\nEnter an option to continue > ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    clearConsole();
                    addBatch();
                    break;
                case 2:
                    clearConsole();
                    updateBatch();
                    break;
                case 3:
                    clearConsole();
                    viewBatch();
                    break;
                case 4:
					clearConsole();
                    homePage();
                    break;
                case 5:
                    exit();
                    break;
            }
        } while (true);
    }
	
	// Grade Management
    public static void gradeManagement() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tGrade Management\t\t\t|");
        System.out.println("-------------------------------------------------------------------------\n");
        System.out.println("\t\t[1] PRF Marks Update");
        System.out.println("\n\t\t[2] DBMS Marks Update ");
        System.out.println("\n\t\t[3] Home");
        System.out.println("\n\t\t[4] Exit");
        
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("\n\nEnter an option to continue > ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    clearConsole();
                    prfMarkUpdate();
                    break;
                case 2:
                    clearConsole();
                    dbmsMarkUpdate();
                    break;
                case 3:
					clearConsole();
                    homePage();
                    break;
                case 4:
                    exit();
                    break;
            }
        } while (true);
    }

    // Report Generator
    public static void reportGenerator() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tReport Generator\t\t\t|");
        System.out.println("-------------------------------------------------------------------------\n");
        System.out.println("\t\t[1] Student Registration Report");
        System.out.println("\n\t\t[2] Batch-wise Student Report");
        System.out.println("\n\t\t[3] Industry Training Eligibility Report");
        System.out.println("\n\t\t[4] Home");
        System.out.println("\n\t\t[5] Exit");
		
		Scanner input = new Scanner(System.in);
        do {
            System.out.print("\n\nEnter an option to continue > ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    clearConsole();
                    studentRegistrationReport();
                    break;
                case 2:
                    clearConsole();
                    BatchWiseStudentReport();
                    break;
                case 3:
                    clearConsole();
                    industryTrainingEligibilityReport();
                    break;
                case 4:
					clearConsole();
                    homePage();
                    break;
                case 5:
                    exit();
                    break;
            }
        } while (true);
    }
    
	// Exit
    public static void exit() {
        clearConsole();
        System.out.println("\n\t\tYou left the program...\n");
        System.exit(0);
    }
	
	
	
	
	
	//================= Methods =================
	
	//finding GPA number
	public static double findGpaValuesFromMarks(int marks){
		if(marks>=90)      return 4.25;
		else if(marks>=80) return 4.00;
		else if(marks>=75) return 3.70;
		else if(marks>=70) return 3.30;
		else if(marks>=65) return 3.00;
		else if(marks>=60) return 2.70;
		else if(marks>=55) return 2.30;
		else if(marks>=50) return 2.00;
		else if(marks>=45) return 1.70;
		else if(marks>=40) return 1.30;
		else if(marks>=30) return 1.00;
		else if(marks>=20) return 0.70;
		else               return 0.25;
	}
	
	//finding GPA value
	public static double calculateGPA(int index){
		int prfMark = studentArray[index].getPrfMark();
		int dbmsMark = studentArray[index].getDbmsMark();
		
		if(prfMark<0 && dbmsMark<0){
			return 0.0;
		}
		if(prfMark>=0 && dbmsMark>=0){
			 return ((double)(findGpaValuesFromMarks(prfMark) + findGpaValuesFromMarks(dbmsMark))/2);
		}
		if(prfMark<0 && dbmsMark>=0){
			 return ((double)(findGpaValuesFromMarks(dbmsMark))/2);
		}
		if(prfMark>=0 && dbmsMark<0){
			 return ((double)(findGpaValuesFromMarks(prfMark))/2);
		}
		return 0.0;
	}
	
	//redirect1
	public static void redirect1(){
		Scanner input = new Scanner(System.in);
		System.out.print("\nHome -- 'H' |  previous menu -- 'P' | exit -- 'E' |--> ");
		char option = input.next().charAt(0);
		option = Character.toUpperCase(option);
		switch(option){
			case 'H':
				clearConsole();
				homePage();
				break;
			case 'P':
				clearConsole();
				studentManagement();
				break;
			case 'E':
				clearConsole();
				exit();
				break;
		}
	}
	
	//redirect2
	public static void redirect2(){
		Scanner input = new Scanner(System.in);
		System.out.print("\nDo you like to view another Student Details ? (Y/N) : ");
		char viewAnotherStudent = input.next().charAt(0);
		viewAnotherStudent = Character.toUpperCase(viewAnotherStudent);
		
		if(viewAnotherStudent == 'Y'){
			clearConsole();
			viewStudentProfile();
		}else{
			System.out.print("\nHome -- 'H' |  previous menu -- 'P' | exit -- 'E' |--> ");
			char option = input.next().charAt(0);
			option = Character.toUpperCase(option);
			switch(option){
				case 'H':
					clearConsole();
					homePage();
					break;
				case 'P':
					clearConsole();
					studentManagement();
					break;
				case 'E':
					clearConsole();
					exit();
					break;
			}
		}
	}
	
	//redirect3
	public static void redirect3(){
		Scanner input = new Scanner(System.in);
		System.out.print("\nHome -- 'H' |  previous menu -- 'P' | exit -- 'E' |--> ");
		char option = input.next().charAt(0);
		option = Character.toUpperCase(option);
		switch(option){
			case 'H':
				clearConsole();
				homePage();
				break;
			case 'P':
				clearConsole();
				batchManagement();
				break;
			case 'E':
				clearConsole();
				exit();
				break;
		}
	}
	
	//redirect4
	public static void redirect4(){
		Scanner input = new Scanner(System.in);
		System.out.print("\nHome -- 'H' |  previous menu -- 'P' | exit -- 'E' |--> ");
		char option = input.next().charAt(0);
		option = Character.toUpperCase(option);
		switch(option){
			case 'H':
				clearConsole();
				homePage();
				break;
			case 'P':
				clearConsole();
				gradeManagement();
				break;
			case 'E':
				clearConsole();
				exit();
				break;
		}
	}
	
	//redirect5
	public static void redirect5(){
		Scanner input = new Scanner(System.in);
		System.out.print("\nHome -- 'H' |  previous menu -- 'P' | exit -- 'E' |--> ");
		char option = input.next().charAt(0);
		option = Character.toUpperCase(option);
		switch(option){
			case 'H':
				clearConsole();
				homePage();
				break;
			case 'P':
				clearConsole();
				reportGenerator();
				break;
			case 'E':
				clearConsole();
				exit();
				break;
		}
	}
	
	//creating a name array in the alphabetical order
	public static Student[] orderedNameArray(){
		Student[] tempStudentArray = new Student[studentArray.length];
		for(int i=0 ; i<studentArray.length ; i++){
			tempStudentArray[i] = studentArray[i];
		}
		
		for(int j=0 ; j<tempStudentArray.length ; j++){
			L1:for(int i=0 ; i<tempStudentArray.length-1 ; i++){
				String lowerCasedNameCurrent = tempStudentArray[i].getName().toLowerCase();
				String lowerCasedNameNext = tempStudentArray[i+1].getName().toLowerCase();
				int minLength=tempStudentArray[i].getName().length()<tempStudentArray[i+1].getName().length() ? tempStudentArray[i].getName().length() : tempStudentArray[i+1].getName().length();
				L2:for(int k=0 ; k<minLength ; k++ ){					
					if((int)lowerCasedNameCurrent.charAt(k)==(int)lowerCasedNameNext.charAt(k)){
						continue L2;
					}else if((int)lowerCasedNameCurrent.charAt(k)>(int)lowerCasedNameNext.charAt(k)){
						Student temp = tempStudentArray[i];
						tempStudentArray[i]=tempStudentArray[i+1];
						tempStudentArray[i+1]=temp;
					}
					continue L1;
				}
				if(tempStudentArray[i].getName().length()>tempStudentArray[i+1].getName().length()){
					Student temp = tempStudentArray[i];
					tempStudentArray[i]=tempStudentArray[i+1];
					tempStudentArray[i+1]=temp;
				}
			}
		}
		return tempStudentArray;
	}
	
	
	
	
	
	
	//================= Student Management =================
	
	//Add Student -- finished
	public static void addStudent(){
		Scanner input = new Scanner(System.in);
		char addToAnotherBatch = 'N';
		char addAnotherStudent = 'N';
		L1:do{
			System.out.println("-----------------------------------------------------------------");
			System.out.println("|\t\t\t   Add Student     \t\t\t|");
			System.out.println("-----------------------------------------------------------------\n");
		
			System.out.print("Enter Batch Number (Students should be added) : ");
			int batchName = input.nextInt();
			input.nextLine();
			
			for(int i=0 ; i<batchArray.length ; i++){
				if(batchArray[i].getBatchName() == batchName){
					if(batchArray[i].getBatchStatus() == 1){
						System.out.print("\nEnter Student NIC  : ");
						String nic = input.nextLine();
						for(int j=0 ; j<studentArray.length ; j++){
							if(studentArray[j].getNic().equals(nic)){
								System.out.println("\n\tThis student is already added to the system.");
								System.out.println("\n\tRegistration No    : "+studentArray[j].getRegNo());
								System.out.println("\tStudent Name       : "+studentArray[j].getName());
								System.out.println("\tStudent NIC        : "+nic);
								System.out.print("\nDo you want to add another student ? (Y/N) : ");
								addAnotherStudent=input.next().charAt(0);
								addAnotherStudent = Character.toUpperCase(addAnotherStudent);
								if(addAnotherStudent == 'Y'){
									clearConsole();
									continue L1;
								}else{
									redirect1();
								}
							}
						}
						System.out.print("Enter Student Name : ");
						String name = input.nextLine();
						System.out.print("\nEnter Lecturer Mode (1-PHYSICAL 0-ONLINE) : ");
						int lecMode = input.nextInt();
						
						int nextNo = 1;
						for(int j=0 ; j<studentArray.length ; j++){
							if(Integer.parseInt(studentArray[j].getRegNo().substring(4,7))==batchName){
								nextNo+=1;
							}
						}
						String regNo = (lecMode==1 ? "PR" : "OR") +24+batchName+String.format("%03d",nextNo);
						System.out.println("\n\tStudent Id --> "+regNo);
						
						if(nextNo==batchArray[i].getBatchMaxCount()){
							batchArray[i].setBatchStatus(0);
						}
						
						Student[] tempStudentArray = new Student[studentArray.length+1];
						for(int j=0 ; j<studentArray.length ; j++){
							tempStudentArray[j] = studentArray[j];
						}
						tempStudentArray[studentArray.length] = new Student(regNo , nic , name , -2 , -2);
						studentArray = tempStudentArray;
						
						System.out.println("\nStudent was successfully added to the system.");
						System.out.print("\nDo you want to add another student ? (Y/N) : ");
						addAnotherStudent=input.next().charAt(0);
						addAnotherStudent = Character.toUpperCase(addAnotherStudent);
						if(addAnotherStudent == 'Y'){
							clearConsole();
							continue L1;
						}else{
							redirect1();
						}
					}else{
						System.out.println("\n\tStudents cannot be added to this batch because enrollment is closed.");
						System.out.print("\nDo you want to add student to another batch ? (Y/N) : ");
						addToAnotherBatch = input.next().charAt(0);
						addToAnotherBatch = Character.toUpperCase(addToAnotherBatch);
						if(addToAnotherBatch == 'Y'){
							clearConsole();
							continue L1;
						}else{
							redirect1();
						}
					}
				}
			}
			System.out.println("\n\tThis batch does not exist in the system.");
			System.out.print("\nDo you want to add student to another batch ? (Y/N) : ");
			addToAnotherBatch = input.next().charAt(0);
			addToAnotherBatch = Character.toUpperCase(addToAnotherBatch);
			if(addToAnotherBatch == 'Y'){
				clearConsole();
				continue L1;
			}else{
				redirect1();
			}
		}while(addToAnotherBatch == 'Y' || addAnotherStudent == 'Y');
	}
	
	//update Student -- finished
	public static void updateStudent(){
		Scanner input = new Scanner(System.in);
		char updateAnotherDetail = 'N';
		do{
			System.out.println("-----------------------------------------------------------------");
			System.out.println("|\t\t\t   Update Student   \t\t\t|");
			System.out.println("-----------------------------------------------------------------\n");
			
			System.out.print("Enter Student Registration No : ");
			String regNo = input.nextLine();
			
			for(int i=0 ; i<studentArray.length ; i++){
				if(studentArray[i].getRegNo().equals(regNo)){
					System.out.println("\n\tStudent Name  : "+studentArray[i].getName());
					System.out.println("\tStudent NIC   : "+studentArray[i].getNic());
					
					System.out.println("\nWhat do you want to update ?");
					System.out.println("\t(01) Student Name ");
					System.out.println("\t(02) Student NIC");
					
					System.out.print("\nEnter your option - ");
					int option=input.nextInt();
					input.nextLine();
					
					switch(option){
						case 1:
							clearConsole();
							System.out.println("Student Name Update");
							System.out.println("===================");
						
							System.out.println("\nRegistration No      : "+regNo);
							System.out.println("Student NIC          : "+studentArray[i].getNic());
							System.out.println("Student Current Name : "+studentArray[i].getName());
							
							System.out.print("\nEnter student name to update - ");
							String newName=input.nextLine();
							studentArray[i].setName(newName);
							System.out.println("\n\tStudent name updated successfully...");
							break;
						case 2:
							char inputNicAgain = 'N';
							int check=0;
							L1:do{
								clearConsole();
								System.out.println("Student NIC Update");
								System.out.println("===================");
							
								System.out.println("\nRegistration No      : "+regNo);
								System.out.println("Student Name         : "+studentArray[i].getName());
								System.out.println("Student Current NIC  : "+studentArray[i].getNic());
								
								System.out.print("\nEnter student NIC to update - ");
								String newNIC=input.nextLine();
								for(int j=0 ; j<studentArray.length ; j++){
									if(studentArray[i].getNic().equals(newNIC)){
										System.out.println("\n\tThis student NIC is already in the system...");
										System.out.println("\nDo you need to update with another NIC No. ? (Y/N) : ");
										inputNicAgain=input.next().charAt(0);
										inputNicAgain=Character.toUpperCase(inputNicAgain);
										if(inputNicAgain=='Y'){
											clearConsole();
											continue L1;
										}else{
											System.out.print("\nGo to Home page--'H' | Go to previous menu--'P' | Update Another Student Details--'U' | Exit--'E' --> ");
											int choice = input.next().charAt(0);
											choice = Character.toUpperCase(choice);
											switch(choice){
												case 'H':
													clearConsole();
													homePage();
													break;
												case 'P':
													clearConsole();
													studentManagement();
													break;
												case 'U':
													clearConsole();
													updateStudent();
													break;
												case 'E':
													clearConsole();
													exit();
													break;
												
											}
										}							
									}
								}
								studentArray[i].setNic(newNIC);
								System.out.println("\n\tStudent ID updated successfully...");
							}while(inputNicAgain=='Y');
							break;
					}
					
					System.out.print("\nDo you want to update another student detail ? (Y/N) : ");
					updateAnotherDetail = input.next().charAt(0);
					updateAnotherDetail = Character.toUpperCase(updateAnotherDetail);
					input.nextLine();
					
					if(updateAnotherDetail=='Y'){
						clearConsole();
						updateStudent();
					}else{
						redirect1();
					}
				}
			}
			System.out.println("\n\tThis student ID not exist in the system\n");
					
			System.out.print("\nEnter the ID again--'A' | Go to Home page--'H' | Go to previous menu--'P' | Exit--'E' --> ");
			char menu = input.next().charAt(0);
			menu = Character.toUpperCase(menu);
			input.nextLine();
			switch(menu){
				case 'H':
					clearConsole();
					homePage();
					break;
				case 'P':
					clearConsole();
					studentManagement();
					break;
				case 'A':
					clearConsole();
					updateStudent();
					break;
				case 'E':
					exit();
					break;					
			}
		}while(updateAnotherDetail=='Y' || updateAnotherDetail=='y');
	}
	
	//view Student Profile -- finished
	public static void viewStudentProfile(){
		Scanner input=new Scanner(System.in);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t\tView Student's Profile\t\t\t|");
		System.out.println("-----------------------------------------------------------------\n");
		
		System.out.print("Enter Student Registration No. : ");
		String regNo = input.nextLine();
		
		for(int i=0 ; i<studentArray.length ; i++){
			if(studentArray[i].getRegNo().equals(regNo)){
				// Move the cursor up five lines  
				System.out.print("\033[2A");  
				// Clear the lines  
				System.out.print("\033[0J");
				
				int prfMark = studentArray[i].getPrfMark();
				int DbmsMark = studentArray[i].getDbmsMark();
				
				System.out.println("\n\n\tRegistration No    : "+regNo);
				System.out.println("\tStudent Name       : "+studentArray[i].getName());
				System.out.println("\tStudent NIC        : "+studentArray[i].getNic());
				System.out.println("\tStudent PRF Marks  : "+(prfMark == -1 ? "absent" : prfMark == -2 ? "not conducted" : prfMark));
				System.out.println("\tStudent DBMS Marks : "+(DbmsMark == -1 ? "absent" : DbmsMark == -2 ? "not conducted" : DbmsMark));
				System.out.println("\tStudent GPA        : "+calculateGPA(i));
				redirect2();
			}
		}
		System.out.println("\n\tThis student does not exist in the system.");
		redirect2();
	}
	
	//delete student profile -- finished
	public static void deleteStudentProfile(){
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t\tDelete Student Profile\t\t\t|");
		System.out.println("-----------------------------------------------------------------\n");
		
		System.out.print("Enter Student Registration No. : ");
		String regNo = input.nextLine();
		
		for(int i=0 ; i<studentArray.length ; i++){
			if(studentArray[i].getRegNo().equals(regNo)){
				// Move the cursor up five lines  
				System.out.print("\033[2A");  
				// Clear the lines  
				System.out.print("\033[0J");
				
				int prfMark = studentArray[i].getPrfMark();
				int DbmsMark = studentArray[i].getDbmsMark();
				
				System.out.println("\n\n\tRegistration No    : "+regNo);
				System.out.println("\tStudent Name       : "+studentArray[i].getName());
				System.out.println("\tStudent NIC        : "+studentArray[i].getNic());
				System.out.println("\tStudent PRF Marks  : "+(prfMark == -1 ? "absent" : prfMark == -2 ? "not conducted" : prfMark));
				System.out.println("\tStudent DBMS Marks : "+(DbmsMark == -1 ? "absent" : DbmsMark == -2 ? "not conducted" : DbmsMark));
				System.out.println("\tStudent GPA        : "+calculateGPA(i));
				
				System.out.print("\nDo you want to delete this student profile ? (Y/N) : ");
				char wantToDeleteThis = input.next().charAt(0);
				wantToDeleteThis = Character.toUpperCase(wantToDeleteThis);
				
				if(wantToDeleteThis == 'Y'){
					Student[] tempStudentArray = new Student[studentArray.length-1];
					L1:for(int j=0 ; j<tempStudentArray.length ; j++){
						if(j<i){
							tempStudentArray[j] = studentArray[i];
						}else if(j==i){
							continue L1;
						}else if(j>i){
							tempStudentArray[j] = studentArray[j+1];
						}
					}
					
					System.out.println("\n\tStudent successfully deleted from the system...");
					System.out.print("\nDo you want to delete another student profile ? (Y/N) : ");
					char wantToDeleteAnother = input.next().charAt(0);
					wantToDeleteAnother = Character.toUpperCase(wantToDeleteAnother);
					if(wantToDeleteAnother=='Y'){
						clearConsole();
						deleteStudentProfile();
					}else{
						redirect1();
					}
				}else{
					redirect1();
				}
			}
		}
		System.out.println("\n\tInvalid Student Id...");
		System.out.print("\nDo you like to try another time ? (Y/N) : ");
		char tryAnotherTime = input.next().charAt(0);
		tryAnotherTime = Character.toUpperCase(tryAnotherTime);
		if(tryAnotherTime=='Y'){
			clearConsole();
			deleteStudentProfile();
		}else{
			redirect1();
		}
	}
	
	
	//================= Batch Management =================
	
	//add batch -- finished
	public static void addBatch(){
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t\t      Add Batch        \t\t\t|");
		System.out.println("-----------------------------------------------------------------\n");
		
		System.out.print("Enter Batch number      : ");
		int batchNo=input.nextInt();
		
		for(int i=0 ; i<batchArray.length ; i++){
			if(batchArray[i].getBatchName()==batchNo){
				System.out.println("\n\tBatch is already added to the system.");
				System.out.print("\nDo you like to input another batch name ? (Y/N) : ");
				char anotherBatchName = input.next().charAt(0);
				anotherBatchName = Character.toUpperCase(anotherBatchName);
				if(anotherBatchName=='Y'){
					clearConsole();
					addBatch();
				}else{
					redirect3();
				}
			}
		}
		int count = 0;
		for(int i=0 ; i<studentArray.length ; i++){
			if((studentArray[i].getRegNo().substring(4,7)).equals(batchNo)){
				count++;
			}
		}
		System.out.print("Enter max allowed count : ");
		int maxCount=input.nextInt();
	
		Batch[] tempBatchArray = new Batch[batchArray.length+1];
		for(int i=0 ; i<batchArray.length ; i++){
			tempBatchArray[i]=batchArray[i];
		}
		tempBatchArray[batchArray.length]=new Batch(batchNo, 1, maxCount);
		batchArray = tempBatchArray;
	
		System.out.println("\n\tBatch successfully added to the system.");
		
		System.out.print("\nDo you like to add another batch ? (Y/N) : ");
		char addAnotherBatch = input.next().charAt(0);
		addAnotherBatch = Character.toUpperCase(addAnotherBatch);
		if(addAnotherBatch=='Y'){
			clearConsole();
			addBatch();
		}else{
			redirect3();
		}
	}
	
	//update batches -- finished
	public static void updateBatch(){
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t\t   Update Batches     \t\t\t|");
		System.out.println("-----------------------------------------------------------------\n");
		
		System.out.print("Enter Batch number : ");
		int batchName=input.nextInt();
		
		for(int i=0 ; i<batchArray.length ; i++){
			if(batchArray[i].getBatchName()==batchName){
				String enrollMassage = (batchArray[i].getBatchStatus()==1 ? "Enrollment Open" : "Enrollment Closed");
				System.out.println("Current Status     : "+enrollMassage);
				System.out.print("\nDo you want to change the batch status to ");
				if(enrollMassage.equals("Enrollment Open")){
					System.out.print("\"Enrollment Closed\"");
				}else if(enrollMassage.equals("Enrollment Closed")){
					System.out.print("\"Enrollment Open\"");
				}
				System.out.print(" ? (Y/N) : ");
				char changeEnrollment = input.next().charAt(0);
				changeEnrollment = Character.toUpperCase(changeEnrollment);
				if(changeEnrollment=='Y'){
					batchArray[i].setBatchStatus(batchArray[i].getBatchStatus()==1 ? 0 : 1);
					System.out.println("\n\tBatch Status updated successfully...");
					
					System.out.print("\nDo you like to update another batch ? (Y/N) : ");
					char updateAnotherBatch = input.next().charAt(0);
					updateAnotherBatch = Character.toUpperCase(updateAnotherBatch);
					if(updateAnotherBatch=='Y'){
						clearConsole();
						updateBatch();
					}else{
						redirect3();
					}
				}else{
					redirect3();
				}
			}
		}
		System.out.println("\n\tInvald Batch number...");
		System.out.print("\nDo you like to try another time ? (Y/N) : ");
		char tryAnotherTime = input.next().charAt(0);
		tryAnotherTime = Character.toUpperCase(tryAnotherTime);
		if(tryAnotherTime=='Y'){
			clearConsole();
			updateBatch();
		}else{
			redirect3();
		}
	}
	
	//view batches -- finished
	public static void viewBatch(){
		Scanner input=new Scanner(System.in);
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("|\t\t\t\t    View Batches     \t\t\t\t|");
		System.out.println("---------------------------------------------------------------------------------\n");
		
		System.out.println("+------+-----------+---------------+----------------+---------------------------+");
		System.out.println("|  No  | Batch No. | Student Count | Max Stu. Count |           Status          |");
		System.out.println("+------+-----------+---------------+----------------+---------------------------+");
		
		for(int i=0 ; i<batchArray.length ; i++){
			int count=0;
			for(int j=0 ; j<studentArray.length ; j++){
				if(studentArray[j].getRegNo().substring(4,7).equals(Integer.toString(batchArray[i].getBatchName()))){
					count++;
				}
			}
			System.out.printf("|  %3d |    %3d    |      %3d      |      %3d       |     %-22s|\n",(i+1) , batchArray[i].getBatchName() , count , batchArray[i].getBatchMaxCount() , (batchArray[i].getBatchStatus()==0) ?  "Enrollment Closed" : "Enrollment Open");
			System.out.println("+------+-----------+---------------+----------------+---------------------------+");
		}
		redirect3();
	}
	
	
	//================= Grade Management =================
	
	//PRF marks update -- finished
	public static void prfMarkUpdate(){
		Scanner input=new Scanner(System.in);
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t\t PRF Marks Update         \t\t|");
		System.out.println("-----------------------------------------------------------------\n");
		
		System.out.print("Enter Student Registration No : ");
		String regNo = input.nextLine();
			
		for(int i=0 ; i<studentArray.length ; i++){
			if(studentArray[i].getRegNo().equals(regNo)){
				// Move the cursor up five lines  
				System.out.print("\033[1A");  
				// Clear the lines  
				System.out.print("\033[0J");
				
				System.out.println("\tRegistration No   : "+ regNo);
				System.out.println("\tStudent Name      : "+ studentArray[i].getName());
				System.out.println("\tStudent NIC       : "+ studentArray[i].getNic());
				
				if(studentArray[i].getPrfMark()==-1){
					System.out.println("\nThis student is absent for the exam. You can update the marks if he/she participate in it...");		
				}else if(studentArray[i].getPrfMark()!=-2){
					System.out.println("\nThis student has already completed the PRF module.");
					System.out.println("\tPRF Marks  : "+studentArray[i].getPrfMark());
				}
				if(studentArray[i].getPrfMark()!=-2){
					System.out.print("\nDo you want to update This student's PRF marks ? (Y/N) : ");
					char wantToChangePrfMarks = input.next().charAt(0);
					wantToChangePrfMarks = Character.toUpperCase(wantToChangePrfMarks);
					if(wantToChangePrfMarks=='N'){
						redirect3();
					}
				}
				
				System.out.print("\tEnter PRF Marks   : ");
				int marks = input.nextInt();
				studentArray[i].setPrfMark(marks);
				System.out.println("\n\tThis student's PRF Marks has updated successfully...");
				
				System.out.print("\nDo you want to update another student PRF marks ? (Y/N) : ");
				char updateAnotherPrfMark = input.next().charAt(0);
				updateAnotherPrfMark = Character.toUpperCase(updateAnotherPrfMark);
				if(updateAnotherPrfMark=='Y'){
					input.nextLine();
					clearConsole();
					prfMarkUpdate();
				}else{
					redirect3();
				}
			}
		}
		System.out.println("\n\tInvalid Student Id...");
		System.out.print("\nDo you want try another time ? (Y/N) : ");
		char tryAnotherTime = input.next().charAt(0);
		tryAnotherTime = Character.toUpperCase(tryAnotherTime);
		if(tryAnotherTime=='Y'){
			input.nextLine();
			clearConsole();
			prfMarkUpdate();
		}else{
			redirect4();
		}
	}
	
	//DBMS marks update -- finished
	public static void dbmsMarkUpdate(){
		Scanner input=new Scanner(System.in);
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t\t DBMS Marks Update        \t\t|");
		System.out.println("-----------------------------------------------------------------\n");
		
		System.out.print("Enter Student Registration No : ");
		String regNo = input.nextLine();
			
		for(int i=0 ; i<studentArray.length ; i++){
			if(studentArray[i].getRegNo().equals(regNo)){
				// Move the cursor up five lines  
				System.out.print("\033[1A");  
				// Clear the lines  
				System.out.print("\033[0J");
				
				System.out.println("\tRegistration No   : "+ regNo);
				System.out.println("\tStudent Name      : "+ studentArray[i].getName());
				System.out.println("\tStudent NIC       : "+ studentArray[i].getNic());
				
				if(studentArray[i].getDbmsMark()==-1){
					System.out.println("\nThis student is absent for the exam. You can update the marks if he/she participate in it...");		
				}else if(studentArray[i].getDbmsMark()!=-2){
					System.out.println("\nThis student has already completed the DBMS module.");
					System.out.println("\tDBMS Marks  : "+studentArray[i].getDbmsMark());
				}
				if(studentArray[i].getDbmsMark()!=-2){
					System.out.print("\nDo you want to update This student's DBMS marks ? (Y/N) : ");
					char wantToChangeDbmsMarks = input.next().charAt(0);
					wantToChangeDbmsMarks = Character.toUpperCase(wantToChangeDbmsMarks);
					if(wantToChangeDbmsMarks=='N'){
						redirect3();
					}
				}
				
				System.out.print("\tEnter DBMS Marks  : ");
				int marks = input.nextInt();
				studentArray[i].setDbmsMark(marks);
				System.out.println("\n\tThis student's DBMS Marks has updated successfully...");
				
				System.out.print("\nDo you want to update another student DBMS marks ? (Y/N) : ");
				char updateAnotherDbmsMark = input.next().charAt(0);
				updateAnotherDbmsMark = Character.toUpperCase(updateAnotherDbmsMark);
				if(updateAnotherDbmsMark=='Y'){
					input.nextLine();
					clearConsole();
					dbmsMarkUpdate();
				}else{
					redirect4();
				}
			}
		}
		System.out.println("\n\tInvalid Student Id...");
		System.out.print("\nDo you want try another time ? (Y/N) : ");
		char tryAnotherTime = input.next().charAt(0);
		tryAnotherTime = Character.toUpperCase(tryAnotherTime);
		if(tryAnotherTime=='Y'){
			input.nextLine();
			clearConsole();
			dbmsMarkUpdate();
		}else{
			redirect4();
		}
	}
	
	
	//================= Report Generation =================
	
	//Student Registration Report Generation -- finished
	public static void studentRegistrationReport(){
		Scanner input=new Scanner(System.in);
		Student[] tempStudentArray=orderedNameArray();
		System.out.println("+----------------------------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println("|                                                            Student Registration Report                                                             |");
		System.out.println("+----------------------------------------------------------------------------------------------------------------------------------------------------+\n");

		System.out.println("+--------+-------------------------+--------------------------------------+---------------------------+----------------+-----------------+-----------+");
		System.out.println("|   No   |     Registration No     |             Student Name             |            NIC            |    PRF Marks   |    DBMS Marks   |    GPA    |");
		System.out.println("+--------+-------------------------+--------------------------------------+---------------------------+----------------+-----------------+-----------+");
					
		for(int i=0 ; i<tempStudentArray.length ; i++){
			System.out.printf("| %6d |       %-11s       |    %-34s|       %-20s|%14s  |%15s  |%7.2f    |\n", (i+1), tempStudentArray[i].getRegNo(), tempStudentArray[i].getName(), tempStudentArray[i].getNic(), tempStudentArray[i].getPrfMark()>0 ? tempStudentArray[i].getPrfMark() : tempStudentArray[i].getPrfMark()==-1 ? "Absent": tempStudentArray[i].getPrfMark()==-2 ? "not conducted":null , tempStudentArray[i].getDbmsMark()>0 ? tempStudentArray[i].getDbmsMark() : tempStudentArray[i].getDbmsMark()==-1 ? "Absent": tempStudentArray[i].getDbmsMark()==-2 ? "not conducted":null, calculateGPA(i));
		}
		System.out.println("+--------+-------------------------+--------------------------------------+---------------------------+---------------+----------------+-----------+");
		redirect5();
	}
	
	//Batch-wise Student Report Generation -- finished
    public static void BatchWiseStudentReport(){
		Scanner input = new Scanner(System.in);

		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t    Batch-wise Student Report    \t\t|");
		System.out.println("-----------------------------------------------------------------");
		
		for(int i=0 ; i<batchArray.length ; i++){
			System.out.printf("\n\t\t[%d] %d Batch\n",(i+1),batchArray[i].getBatchName());
		}
		System.out.printf("\n\t\t[%d] Home\n",batchArray.length+1);
		System.out.printf("\n\t\t[%d] Exit\n",batchArray.length+2);
		
		System.out.print("\n\nEnter an option to continue > ");
		int option = input.nextInt();
		
		if(option<(batchArray.length+1)){
			clearConsole();
			System.out.println("+----------------------------------------------------------------------------------------------------------------------------------------------------+");
			System.out.printf("|                                                              %4d Batch Student Report                                                             |\n",batchArray[option-1].getBatchName());
			System.out.println("+----------------------------------------------------------------------------------------------------------------------------------------------------+\n");
			
			System.out.println("+--------+-------------------------+--------------------------------------+---------------------------+----------------+-----------------+-----------+");
			System.out.println("|   No   |     Registration No     |             Student Name             |            NIC            |    PRF Marks   |    DBMS Marks   |    GPA    |");
			System.out.println("+--------+-------------------------+--------------------------------------+---------------------------+----------------+-----------------+-----------+");
				
			int count=1;
			int batchName = batchArray[option-1].getBatchName();
			for(int i=0 ; i<studentArray.length ; i++){
				if(studentArray[i].getRegNo().substring(4,7).equals(Integer.toString(batchName))){
					System.out.printf("| %6d |       %-11s       |    %-34s|       %-20s|%14s  |%15s  |%7.2f    |\n", count++, studentArray[i].getRegNo(), studentArray[i].getName(), studentArray[i].getNic(), studentArray[i].getPrfMark()>0 ? studentArray[i].getPrfMark() : studentArray[i].getPrfMark()==-1 ? "Absent": studentArray[i].getPrfMark()==-2 ? "not conducted":null , studentArray[i].getDbmsMark()>0 ? studentArray[i].getDbmsMark() : studentArray[i].getDbmsMark()==-1 ? "Absent": studentArray[i].getDbmsMark()==-2 ? "not conducted":null, calculateGPA(i));
				}
			}
			System.out.println("+--------+-------------------------+--------------------------------------+---------------------------+----------------+-----------------+-----------+");
			
			System.out.print("\nDo you want to get another batch report ? (Y/N) : ");
				char anotherBatchReport = input.next().charAt(0);
				anotherBatchReport = Character.toUpperCase(anotherBatchReport);
				if(anotherBatchReport=='Y'){
					clearConsole();
					BatchWiseStudentReport();
				}else{
					redirect5();
				}
		}else if(option==(batchArray.length+1)){
			clearConsole();
			homePage();
		}else if(option==(batchArray.length+1)){
			clearConsole();
			exit();
		}
	}
	
	//Industry Training Eligibility Report
    public static void industryTrainingEligibilityReport(){
		Scanner input=new Scanner(System.in);
		System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println("|                                                         Industry Training Eligibility Report                                                     |");
		System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------+\n");
		
		System.out.println("+--------+-------------------------+--------------------------------------+---------------------------+---------------+----------------+-----------+");
		System.out.println("|   No   |     Registration No     |             Student Name             |            NIC            |   PRF Marks   |   DBMS Marks   |    GPA    |");
		System.out.println("+--------+-------------------------+--------------------------------------+---------------------------+---------------+----------------+-----------+");
		
		int count=1;
		for(int i=0 ; i<studentArray.length ; i++){
			if(studentArray[i].getPrfMark()>50 && studentArray[i].getDbmsMark()>50 && calculateGPA(i)>3.25){
				System.out.printf("| %6d |       %-11s       |    %-34s|       %-20s|%8d       |%9d       |%7.2f    |\n", count++, studentArray[i].getRegNo(), studentArray[i].getName(), studentArray[i].getNic(), studentArray[i].getPrfMark(), studentArray[i].getDbmsMark(), calculateGPA(i));
			}
		}
		System.out.println("+--------+-------------------------+--------------------------------------+---------------------------+---------------+----------------+-----------+");
		
		redirect5();
	}
	
	
	//================= Main Method =================
	public static void main(String[] args){
		homePage();
	}
}	
	
	
	
	
	
	
