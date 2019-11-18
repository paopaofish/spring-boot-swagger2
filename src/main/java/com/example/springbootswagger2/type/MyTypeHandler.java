package com.example.springbootswagger2.type;

import org.apache.ibatis.type.*;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@MappedJdbcTypes(JdbcType.NUMERIC)
@MappedTypes(Long.class)
public class MyTypeHandler extends BaseTypeHandler<Long> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int paramIndex, Long o, JdbcType jdbcType) throws SQLException {
        Long b = (Long) o;
        BigDecimal nd = new BigDecimal(b);
        preparedStatement.setBigDecimal(paramIndex,nd);
    }

    @Override
    public Long getNullableResult(ResultSet resultSet, String columnLabel) throws SQLException {
        BigDecimal bigDecimal = resultSet.getBigDecimal(columnLabel);
        return bigDecimal.longValue();
    }

    @Override
    public Long getNullableResult(ResultSet resultSet, int columnIndex) throws SQLException {
        BigDecimal bigDecimal = resultSet.getBigDecimal(columnIndex);
        return bigDecimal.longValue();
    }

    @Override
    public Long getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        BigDecimal bigDecimal = callableStatement.getBigDecimal(i);
        return bigDecimal.longValue();
    }
}