import com.blockchainexample.enums.Step;
import com.blockchainexample.helper.ConsoleHelper;
import com.blockchainexample.interactors.ApplicationSteps;
import com.blockchainexample.interactors.impl.*;


import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) {

        BlockChain blockChain = new BlockChain();

        Map<Step, ApplicationSteps> applicationSteps = Stream.of(new ChooseDataTypeStepImpl(), new NumberStepImpl(),
                        new ObjectStepImpl(), new TextStepImpl(), new ContinueStepImpl(), new MinerImpl(),
                        new ExitStepImpl(), new ErrorStepImpl())
                .collect(Collectors.toMap(ApplicationSteps::step, v -> v));

        Step currentStep = Step.CHOOSEDATATYPE;

        ConsoleHelper.printApplicationHeader();

        do {
            currentStep = applicationSteps
                    .get(currentStep)
                    .execute(blockChain);

        } while (currentStep != null);
    }
}
