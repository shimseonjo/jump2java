import java.sql.*;
import java.util.Date;

public class MysqlDbConn {
    public static void main(String[] args) {
        // DB 연결 정보
        String url = "jdbc:mysql://localhost:3306/employees"; // MySQL 서버 주소, DB명
        String user = "root"; // MySQL 사용자 계정
        String password = "qwer1234"; // MySQL 비밀번호

        try {
            // 1. JDBC 드라이버 로드
            // Java 6부터는 Class.forName("com.mysql.cj.jdbc.Driver") 대신 Driver Manager가 자동으로 로드합니다.
            // Class.forName("com.mysql.cj.jdbc.Driver"); // 최신 MySQL Connector 버전의 드라이버 클래스명

            // 2. DB 연결
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("MySQL 연결 성공!");

            // 3. 쿼리 실행
            Statement stmt = conn.createStatement();

            // SELECT 문 실행 → ResultSet 리턴
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");

            // 결과 처리
            while (rs.next()) {
                int id = rs.getInt("emp_no");          // 컬럼명으로 접근
                String name = rs.getString("first_name");
                Date hireDate = rs.getDate("hire_date");

                System.out.println(id + " | " + name + " | " + hireDate);
            }

            rs.close();
            stmt.close();

            // 4. DB 연결 종료 (자원을 반환하는 것이 중요)
            if (conn != null) {
                conn.close();
                System.out.println("MySQL 연결 종료.");
            }
        } catch (SQLException e) {
            System.err.println("MySQL 연결 실패: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
