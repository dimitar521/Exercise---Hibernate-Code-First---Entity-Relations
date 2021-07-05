import javax.persistence.*;

@Entity
@Table
public class ResultPrediction extends BaseEntity{
    private PredictionEnum predictionEnum;

    public ResultPrediction() {
    }
@Enumerated(EnumType.STRING)
@Column(name = "prediction")
public PredictionEnum getPredictionEnum() {
        return predictionEnum;
    }

    public void setPredictionEnum(PredictionEnum predictionEnum) {
        this.predictionEnum = predictionEnum;
    }
}
