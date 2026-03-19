export default function Q7_Message() {
    let isFalse = false;
    let message = "안녕하세요";

    function handleClick() {
        if(isFalse) {
            message = "안녕하세요";
            isFalse = true;
        } else {
            message = "반갑습니다"
            isFalse = false;
        }
    }

    return (
        <>
            <p>{message}</p>
            <button onClick={handleClick}>클릭</button>
        </>
    )
}